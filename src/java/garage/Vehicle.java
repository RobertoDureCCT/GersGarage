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
@Table(name = "vehicle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
    , @NamedQuery(name = "Vehicle.findByIdVehicle", query = "SELECT v FROM Vehicle v WHERE v.idVehicle = :idVehicle")
    , @NamedQuery(name = "Vehicle.findByMake", query = "SELECT v FROM Vehicle v WHERE v.make = :make")
    , @NamedQuery(name = "Vehicle.findByModel", query = "SELECT v FROM Vehicle v WHERE v.model = :model")
    , @NamedQuery(name = "Vehicle.findByEngine", query = "SELECT v FROM Vehicle v WHERE v.engine = :engine")
    , @NamedQuery(name = "Vehicle.findByLicence", query = "SELECT v FROM Vehicle v WHERE v.licence = :licence")})
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_vehicle")
    private Integer idVehicle;
    @Size(max = 45)
    @Column(name = "make")
    private String make;
    @Size(max = 45)
    @Column(name = "model")
    private String model;
    @Size(max = 45)
    @Column(name = "engine")
    private String engine;
    @Column(name = "licence")
    private Integer licence;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicleIdVehicle")
    private List<Book> bookList;

    public Vehicle() {
    }

    public Vehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
    }

    public Integer getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getLicence() {
        return licence;
    }

    public void setLicence(Integer licence) {
        this.licence = licence;
    }

    @XmlTransient
    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehicle != null ? idVehicle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.idVehicle == null && other.idVehicle != null) || (this.idVehicle != null && !this.idVehicle.equals(other.idVehicle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "garage.Vehicle[ idVehicle=" + idVehicle + " ]";
    }
    
}
