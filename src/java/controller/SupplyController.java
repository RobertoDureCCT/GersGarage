package controller;

import garage.Supply;
import garage.Maintenance;
import java.util.List;
import facade.SupplyFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "supplyController")
@ViewScoped
public class SupplyController extends AbstractController<Supply> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isMaintenanceListEmpty;

    public SupplyController() {
        // Inform the Abstract parent controller of the concrete Supply Entity
        super(Supply.class);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsMaintenanceListEmpty();
    }

    public boolean getIsMaintenanceListEmpty() {
        return this.isMaintenanceListEmpty;
    }

    private void setIsMaintenanceListEmpty() {
        Supply selected = this.getSelected();
        if (selected != null) {
            SupplyFacade ejbFacade = (SupplyFacade) this.getFacade();
            this.isMaintenanceListEmpty = ejbFacade.isMaintenanceListEmpty(selected);
        } else {
            this.isMaintenanceListEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of Maintenance entities that
     * are retrieved from Supply and returns the navigation outcome.
     *
     * @return navigation outcome for Maintenance page
     */
    public String navigateMaintenanceList() {
        Supply selected = this.getSelected();
        if (selected != null) {
            SupplyFacade ejbFacade = (SupplyFacade) this.getFacade();
            List<Maintenance> selectedMaintenanceList = ejbFacade.findMaintenanceList(selected);
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Maintenance_items", selectedMaintenanceList);
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/maintenance/index";
    }

}
