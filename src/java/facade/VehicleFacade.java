/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Vehicle;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import garage.Book;
import java.util.List;

/**
 *
 * @author roberto
 */
@Stateless
public class VehicleFacade extends AbstractFacade<Vehicle> {

    @PersistenceContext(unitName = "GarageJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehicleFacade() {
        super(Vehicle.class);
    }

    public boolean isBookListEmpty(Vehicle entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Vehicle> vehicle = cq.from(Vehicle.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(vehicle, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Book> findBookList(Vehicle entity) {
        Vehicle mergedEntity = this.getMergedEntity(entity);
        List<Book> bookList = mergedEntity.getBookList();
        bookList.size();
        return bookList;
    }
    
}
