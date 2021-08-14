/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.User;
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
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "GarageJPAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    public boolean isBookListEmpty(User entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<User> user = cq.from(User.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(user, entity));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Book> findBookList(User entity) {
        User mergedEntity = this.getMergedEntity(entity);
        List<Book> bookList = mergedEntity.getBookList();
        bookList.size();
        return bookList;
    }
    
}
