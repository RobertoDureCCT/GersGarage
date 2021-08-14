package controller;

import garage.User;
import garage.Book;
import java.util.List;
import facade.UserFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Named(value = "userController")
@ViewScoped
public class UserController extends AbstractController<User> {

    @Inject
    private MobilePageController mobilePageController;

    // Flags to indicate if child collections are empty
    private boolean isBookListEmpty;

    public UserController() {
        // Inform the Abstract parent controller of the concrete User Entity
        super(User.class);
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
        User selected = this.getSelected();
        if (selected != null) {
            UserFacade ejbFacade = (UserFacade) this.getFacade();
            this.isBookListEmpty = ejbFacade.isBookListEmpty(selected);
        } else {
            this.isBookListEmpty = true;
        }
    }

    /**
     * Sets the "items" attribute with a collection of Book entities that are
     * retrieved from User and returns the navigation outcome.
     *
     * @return navigation outcome for Book page
     */
    public String navigateBookList() {
        User selected = this.getSelected();
        if (selected != null) {
            UserFacade ejbFacade = (UserFacade) this.getFacade();
            List<Book> selectedBookList = ejbFacade.findBookList(selected);
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Book_items", selectedBookList);
        }
        return this.mobilePageController.getMobilePagesPrefix() + "/app/book/index";
    }

}
