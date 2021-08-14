/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roberto
 */
@Entity
@Table(name = "invoice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i")
    , @NamedQuery(name = "Invoice.findByIdInvoice", query = "SELECT i FROM Invoice i WHERE i.idInvoice = :idInvoice")
    , @NamedQuery(name = "Invoice.findByMaintenanceDescription", query = "SELECT i FROM Invoice i WHERE i.maintenanceDescription = :maintenanceDescription")
    , @NamedQuery(name = "Invoice.findByAmount", query = "SELECT i FROM Invoice i WHERE i.amount = :amount")})
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_invoice")
    private Integer idInvoice;
    @Size(max = 45)
    @Column(name = "maintenance_description")
    private String maintenanceDescription;
    @Size(max = 45)
    @Column(name = "amount")
    private String amount;
    @JoinColumn(name = "maintenance_id_maintenance", referencedColumnName = "id_maintenance")
    @ManyToOne(optional = false)
    private Maintenance maintenanceIdMaintenance;

    public Invoice() {
    }

    public Invoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getMaintenanceDescription() {
        return maintenanceDescription;
    }

    public void setMaintenanceDescription(String maintenanceDescription) {
        this.maintenanceDescription = maintenanceDescription;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Maintenance getMaintenanceIdMaintenance() {
        return maintenanceIdMaintenance;
    }

    public void setMaintenanceIdMaintenance(Maintenance maintenanceIdMaintenance) {
        this.maintenanceIdMaintenance = maintenanceIdMaintenance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInvoice != null ? idInvoice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.idInvoice == null && other.idInvoice != null) || (this.idInvoice != null && !this.idInvoice.equals(other.idInvoice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "garage.Invoice[ idInvoice=" + idInvoice + " ]";
    }
    
}
