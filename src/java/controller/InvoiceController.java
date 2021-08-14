package controller;

import garage.Invoice;
import facade.InvoiceFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "invoiceController")
@ViewScoped
public class InvoiceController extends AbstractController<Invoice> {

    @Inject
    private MaintenanceController maintenanceIdMaintenanceController;
    @Inject
    private MobilePageController mobilePageController;

    public InvoiceController() {
        // Inform the Abstract parent controller of the concrete Invoice Entity
        super(Invoice.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        maintenanceIdMaintenanceController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Maintenance controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareMaintenanceIdMaintenance(ActionEvent event) {
        Invoice selected = this.getSelected();
        if (selected != null && maintenanceIdMaintenanceController.getSelected() == null) {
            maintenanceIdMaintenanceController.setSelected(selected.getMaintenanceIdMaintenance());
        }
    }

}
