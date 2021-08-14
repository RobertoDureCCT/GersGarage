/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Supply;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import garage.Maintenance;
import java.util.List;

/**
 *
 * @author roberto
 */
@Stateless
public class SupplyFacade extends AbstractFacade<Supply> {

    @PersistenceContext(unitName = "GarageJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupplyFacade() {
        super(Supply.class);
    }

    public boolean isMaintenanceListEmpty(Supply entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Supply> supply = cq.from(Supply.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(supply, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Maintenance> findMaintenanceList(Supply entity) {
        Supply mergedEntity = this.getMergedEntity(entity);
        List<Maintenance> maintenanceList = mergedEntity.getMaintenanceList();
        maintenanceList.size();
        return maintenanceList;
    }
    
}
