/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Maintenance;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import garage.Supply;
import garage.Invoice;
import garage.Book;
import java.util.List;

/**
 *
 * @author roberto
 */
@Stateless
public class MaintenanceFacade extends AbstractFacade<Maintenance> {

    @PersistenceContext(unitName = "GarageJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MaintenanceFacade() {
        super(Maintenance.class);
    }

    public boolean isSupplyListEmpty(Maintenance entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Maintenance> maintenance = cq.from(Maintenance.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(maintenance, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Supply> findSupplyList(Maintenance entity) {
        Maintenance mergedEntity = this.getMergedEntity(entity);
        List<Supply> supplyList = mergedEntity.getSupplyList();
        supplyList.size();
        return supplyList;
    }

    public boolean isInvoiceListEmpty(Maintenance entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Maintenance> maintenance = cq.from(Maintenance.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(maintenance, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Invoice> findInvoiceList(Maintenance entity) {
        Maintenance mergedEntity = this.getMergedEntity(entity);
        List<Invoice> invoiceList = mergedEntity.getInvoiceList();
        invoiceList.size();
        return invoiceList;
    }

    public boolean isBookIdbookEmpty(Maintenance entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Maintenance> maintenance = cq.from(Maintenance.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(maintenance, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Book findBookIdbook(Maintenance entity) {
        return this.getMergedEntity(entity).getBookIdbook();
    }

    @Override
    public Maintenance findWithParents(Maintenance entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Maintenance> cq = cb.createQuery(Maintenance.class);
        Root<Maintenance> maintenance = cq.from(Maintenance.class);
       // maintenance.fetch(Maintenance_.supplyList, JoinType.LEFT);
        cq.select(maintenance).where(cb.equal(maintenance, entity));
        try {
            return em.createQuery(cq).getSingleResult();
        } catch (Exception e) {
            return entity;
        }
    }
    
}
