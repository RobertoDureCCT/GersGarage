package controller;

import garage.Vehicle;
import garage.Book;
import java.util.List;
import facade.VehicleFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "vehicleController")
@ViewScoped
public class VehicleController extends AbstractController<Vehicle> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isBookListEmpty;

    public VehicleController() {
        // Inform the Abstract parent controller of the concrete Vehicle Entity
        super(Vehicle.class);
    }

    /**
     * Set the "is[ChildCollection]Empty" property for OneToMany fields.
     */
    @Override
    protected void setChildrenEmptyFlags() {
        this.setIsBookListEmpty();
    }

    public boolean getIsBookListEmpty() {
        return this.isBookListEmpty;
    }

    private void setIsBookListEmpty() {
        Vehicle selected = this.getSelected();
        if (selected != null) {
            VehicleFacade ejbFacade = (VehicleFacade) this.getFacade();
            this.isBookListEmpty = ejbFacade.isBookListEmpty(selected);
        } else {
            this.isBookListEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of Book entities that are
     * retrieved from Vehicle and returns the navigation outcome.
     *
     * @return navigation outcome for Book page
     */
    public String navigateBookList() {
        Vehicle selected = this.getSelected();
        if (selected != null) {
            VehicleFacade ejbFacade = (VehicleFacade) this.getFacade();
            List<Book> selectedBookList = ejbFacade.findBookList(selected);
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Book_items", selectedBookList);
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/book/index";
    }

}
