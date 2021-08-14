package controller;

import garage.Book;
import garage.Maintenance;
import java.util.List;
import facade.BookFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "bookController")
@ViewScoped
public class BookController extends AbstractController<Book> {

    @Inject
    private UserController userIdUserController;
    @Inject
    private VehicleController vehicleIdVehicleController;
    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isMaintenanceListEmpty;

    public BookController() {
        // Inform the Abstract parent controller of the concrete Book Entity
        super(Book.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        userIdUserController.setSelected(null);
        vehicleIdVehicleController.setSelected(null);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsMaintenanceListEmpty();
    }

    /**
     * Sets the "selected" attribute of the User controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareUserIdUser(ActionEvent event) {
        Book selected = this.getSelected();
        if (selected != null && userIdUserController.getSelected() == null) {
            userIdUserController.setSelected(selected.getUserIdUser());
        }
    }

    /**
     * Sets the "selected" attribute of the Vehicle controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareVehicleIdVehicle(ActionEvent event) {
        Book selected = this.getSelected();
        if (selected != null && vehicleIdVehicleController.getSelected() == null) {
            vehicleIdVehicleController.setSelected(selected.getVehicleIdVehicle());
        }
    }

    public boolean getIsMaintenanceListEmpty() {
        return this.isMaintenanceListEmpty;
    }

    private void setIsMaintenanceListEmpty() {
        Book selected = this.getSelected();
        if (selected != null) {
            BookFacade ejbFacade = (BookFacade) this.getFacade();
            this.isMaintenanceListEmpty = ejbFacade.isMaintenanceListEmpty(selected);
        } else {
            this.isMaintenanceListEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of Maintenance entities that
     * are retrieved from Book and returns the navigation outcome.
     *
     * @return navigation outcome for Maintenance page
     */
    public String navigateMaintenanceList() {
        Book selected = this.getSelected();
        if (selected != null) {
            BookFacade ejbFacade = (BookFacade) this.getFacade();
            List<Maintenance> selectedMaintenanceList = ejbFacade.findMaintenanceList(selected);
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Maintenance_items", selectedMaintenanceList);
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/maintenance/index";
    }

}
