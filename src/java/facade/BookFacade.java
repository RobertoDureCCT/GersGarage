/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Book;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import garage.User;
import garage.Vehicle;
import garage.Maintenance;
import java.util.List;

/**
 *
 * @author roberto
 */
@Stateless
public class BookFacade extends AbstractFacade<Book> {

    @PersistenceContext(unitName = "GarageJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookFacade() {
        super(Book.class);
    }

    public boolean isUserIdUserEmpty(Book entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Book> book = cq.from(Book.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(book, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public User findUserIdUser(Book entity) {
        return this.getMergedEntity(entity).getUserIdUser();
    }

    public boolean isVehicleIdVehicleEmpty(Book entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Book> book = cq.from(Book.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(book, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Vehicle findVehicleIdVehicle(Book entity) {
        return this.getMergedEntity(entity).getVehicleIdVehicle();
    }

    public boolean isMaintenanceListEmpty(Book entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Book> book = cq.from(Book.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(book, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Maintenance> findMaintenanceList(Book entity) {
        Book mergedEntity = this.getMergedEntity(entity);
        List<Maintenance> maintenanceList = mergedEntity.getMaintenanceList();
        maintenanceList.size();
        return maintenanceList;
    }
    
}
