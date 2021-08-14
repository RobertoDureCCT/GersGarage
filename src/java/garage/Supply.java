/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "supply")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supply.findAll", query = "SELECT s FROM Supply s")
    , @NamedQuery(name = "Supply.findByIdSupply", query = "SELECT s FROM Supply s WHERE s.idSupply = :idSupply")
    , @NamedQuery(name = "Supply.findByDescription", query = "SELECT s FROM Supply s WHERE s.description = :description")
    , @NamedQuery(name = "Supply.findByBrand", query = "SELECT s FROM Supply s WHERE s.brand = :brand")})
public class Supply implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_supply")
    private Integer idSupply;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @Size(max = 45)
    @Column(name = "brand")
    private String brand;
    @ManyToMany(mappedBy = "supplyList")
    private List<Maintenance> maintenanceList;

    public Supply() {
    }

    public Supply(Integer idSupply) {
        this.idSupply = idSupply;
    }

    public Integer getIdSupply() {
        return idSupply;
    }

    public void setIdSupply(Integer idSupply) {
        this.idSupply = idSupply;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @XmlTransient
    public List<Maintenance> getMaintenanceList() {
        return maintenanceList;
    }

    public void setMaintenanceList(List<Maintenance> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSupply != null ? idSupply.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supply)) {
            return false;
        }
        Supply other = (Supply) object;
        if ((this.idSupply == null && other.idSupply != null) || (this.idSupply != null && !this.idSupply.equals(other.idSupply))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "garage.Supply[ idSupply=" + idSupply + " ]";
    }
    
}
