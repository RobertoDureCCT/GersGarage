package controller;

import garage.Maintenance;
import garage.Supply;
import garage.Invoice;
import java.util.List;
import facade.MaintenanceFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "maintenanceController")
@ViewScoped
public class MaintenanceController extends AbstractController<Maintenance> {

    @Inject
    private BookController bookIdbookController;
    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isSupplyListEmpty;
    private boolean isInvoiceListEmpty;

    public MaintenanceController() {
        // Inform the Abstract parent controller of the concrete Maintenance Entity
        super(Maintenance.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        bookIdbookController.setSelected(null);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsSupplyListEmpty();
        this.setIsInvoiceListEmpty();
    }

    public boolean getIsSupplyListEmpty() {
        return this.isSupplyListEmpty;
    }

    private void setIsSupplyListEmpty() {
        Maintenance selected = this.getSelected();
        if (selected != null) {
            MaintenanceFacade ejbFacade = (MaintenanceFacade) this.getFacade();
            this.isSupplyListEmpty = (selected.getSupplyList() == null || selected.getSupplyList().isEmpty());
        } else {
            this.isSupplyListEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of Supply entities that are
     * retrieved from Maintenance and returns the navigation outcome.
     *
     * @return navigation outcome for Supply page
     */
    public String navigateSupplyList() {
        Maintenance selected = this.getSelected();
        if (selected != null) {
            MaintenanceFacade ejbFacade = (MaintenanceFacade) this.getFacade();
            // Note: SupplyList has already been read as is initialized
            List<Supply> selectedSupplyList = selected.getSupplyList();
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Supply_items", selectedSupplyList);
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/supply/index";
    }

    public boolean getIsInvoiceListEmpty() {
        return this.isInvoiceListEmpty;
    }

    private void setIsInvoiceListEmpty() {
        Maintenance selected = this.getSelected();
        if (selected != null) {
            MaintenanceFacade ejbFacade = (MaintenanceFacade) this.getFacade();
            this.isInvoiceListEmpty = ejbFacade.isInvoiceListEmpty(selected);
        } else {
            this.isInvoiceListEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of Invoice entities that are
     * retrieved from Maintenance and returns the navigation outcome.
     *
     * @return navigation outcome for Invoice page
     */
    public String navigateInvoiceList() {
        Maintenance selected = this.getSelected();
        if (selected != null) {
            MaintenanceFacade ejbFacade = (MaintenanceFacade) this.getFacade();
            List<Invoice> selectedInvoiceList = ejbFacade.findInvoiceList(selected);
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Invoice_items", selectedInvoiceList);
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/invoice/index";
    }

    /**
     * Sets the "selected" attribute of the Book controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareBookIdbook(ActionEvent event) {
        Maintenance selected = this.getSelected();
        if (selected != null && bookIdbookController.getSelected() == null) {
            bookIdbookController.setSelected(selected.getBookIdbook());
        }
    }

}
