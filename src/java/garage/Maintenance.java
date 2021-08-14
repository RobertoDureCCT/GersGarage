/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author roberto
 */
@Entity
@Table(name = "maintenance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maintenance.findAll", query = "SELECT m FROM Maintenance m")
    , @NamedQuery(name = "Maintenance.findByIdMaintenance", query = "SELECT m FROM Maintenance m WHERE m.idMaintenance = :idMaintenance")
    , @NamedQuery(name = "Maintenance.findByType", query = "SELECT m FROM Maintenance m WHERE m.type = :type")
    , @NamedQuery(name = "Maintenance.findByDescription", query = "SELECT m FROM Maintenance m WHERE m.description = :description")
    , @NamedQuery(name = "Maintenance.findByStatus", query = "SELECT m FROM Maintenance m WHERE m.status = :status")})
public class Maintenance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_maintenance")
    private Integer idMaintenance;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @Size(max = 120)
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Boolean status;
    @JoinTable(name = "maintenance_supply", joinColumns = {
        @JoinColumn(name = "maintenance_id_maintenance", referencedColumnName = "id_maintenance")}, inverseJoinColumns = {
        @JoinColumn(name = "supply_id_supply", referencedColumnName = "id_supply")})
    @ManyToMany
    private List<Supply> supplyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maintenanceIdMaintenance")
    private List<Invoice> invoiceList;
    @JoinColumn(name = "book_idbook", referencedColumnName = "idbook")
    @ManyToOne(optional = false)
    private Book bookIdbook;

    public Maintenance() {
    }

    public Maintenance(Integer idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public Integer getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(Integer idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @XmlTransient
    public List<Supply> getSupplyList() {
        return supplyList;
    }

    public void setSupplyList(List<Supply> supplyList) {
        this.supplyList = supplyList;
    }

    @XmlTransient
    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public Book getBookIdbook() {
        return bookIdbook;
    }

    public void setBookIdbook(Book bookIdbook) {
        this.bookIdbook = bookIdbook;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaintenance != null ? idMaintenance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maintenance)) {
            return false;
        }
        Maintenance other = (Maintenance) object;
        if ((this.idMaintenance == null && other.idMaintenance != null) || (this.idMaintenance != null && !this.idMaintenance.equals(other.idMaintenance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "garage.Maintenance[ idMaintenance=" + idMaintenance + " ]";
    }
    
}
