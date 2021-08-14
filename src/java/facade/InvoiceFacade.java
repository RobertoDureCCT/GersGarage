/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Invoice;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import garage.Maintenance;

/**
 *
 * @author roberto
 */
@Stateless
public class InvoiceFacade extends AbstractFacade<Invoice> {

    @PersistenceContext(unitName = "GarageJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InvoiceFacade() {
        super(Invoice.class);
    }

    public boolean isMaintenanceIdMaintenanceEmpty(Invoice entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Invoice> invoice = cq.from(Invoice.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(invoice, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Maintenance findMaintenanceIdMaintenance(Invoice entity) {
        return this.getMergedEntity(entity).getMaintenanceIdMaintenance();
    }
    
}
