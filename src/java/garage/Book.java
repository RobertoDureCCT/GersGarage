/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author roberto
 */
@Entity
@Table(name = "book")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
    , @NamedQuery(name = "Book.findByIdbook", query = "SELECT b FROM Book b WHERE b.idbook = :idbook")
    , @NamedQuery(name = "Book.findByService", query = "SELECT b FROM Book b WHERE b.service = :service")
    , @NamedQuery(name = "Book.findByUser", query = "SELECT b FROM Book b WHERE b.user = :user")
    , @NamedQuery(name = "Book.findByVehicle", query = "SELECT b FROM Book b WHERE b.vehicle = :vehicle")
    , @NamedQuery(name = "Book.findByDate", query = "SELECT b FROM Book b WHERE b.date = :date")
    , @NamedQuery(name = "Book.findByDescription", query = "SELECT b FROM Book b WHERE b.description = :description")
    , @NamedQuery(name = "Book.findByStatus", query = "SELECT b FROM Book b WHERE b.status = :status")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idbook")
    private Integer idbook;
    @Size(max = 45)
    @Column(name = "service")
    private String service;
    @Column(name = "user")
    private Integer user;
    @Column(name = "vehicle")
    private Integer vehicle;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    public User userIdUser;
    @JoinColumn(name = "vehicle_id_vehicle", referencedColumnName = "id_vehicle")
    @ManyToOne(optional = false)
    private Vehicle vehicleIdVehicle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookIdbook")
    private List<Maintenance> maintenanceList;

    public Book() {
    }

    public Book(Integer idbook) {
        this.idbook = idbook;
    }

    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getVehicle() {
        return vehicle;
    }

    public void setVehicle(Integer vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(User userIdUser) {
        this.userIdUser = userIdUser;
    }

    public Vehicle getVehicleIdVehicle() {
        return vehicleIdVehicle;
    }

    public void setVehicleIdVehicle(Vehicle vehicleIdVehicle) {
        this.vehicleIdVehicle = vehicleIdVehicle;
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
        hash += (idbook != null ? idbook.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.idbook == null && other.idbook != null) || (this.idbook != null && !this.idbook.equals(other.idbook))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "garage.Book[ idbook=" + idbook + " ]";
    }
    
}
