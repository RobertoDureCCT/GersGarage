/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author roberto
 */
public class AbstractFacadeTest {
    
    public AbstractFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEntityManager method, of class AbstractFacade.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        AbstractFacade instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AbstractFacade.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Object entity = null;
        AbstractFacade instance = null;
        instance.create(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AbstractFacade.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Object entity = null;
        AbstractFacade instance = null;
        instance.edit(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AbstractFacade.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object entity = null;
        AbstractFacade instance = null;
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AbstractFacade.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object id = null;
        AbstractFacade instance = null;
        Object expResult = null;
        Object result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AbstractFacade.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AbstractFacade.
     */
    @Test
    public void testFindRange_intArr() {
        System.out.println("findRange");
        int[] range = null;
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AbstractFacade.
     */
    @Test
    public void testCount_0args() {
        System.out.println("count");
        AbstractFacade instance = null;
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AbstractFacade.
     */
    @Test
    public void testFindRange_5args() {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        String sortField = "";
        String sortOrder = "";
        Map<String, Object> filters = null;
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findRange(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AbstractFacade.
     */
    @Test
    public void testFindRange_4args() {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        Map<String, String> sortFields = null;
        Map<String, Object> filters = null;
        AbstractFacade instance = null;
        List expResult = null;
        List result = instance.findRange(first, pageSize, sortFields, filters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AbstractFacade.
     */
    @Test
    public void testCount_Map() {
        System.out.println("count");
        Map<String, Object> filters = null;
        AbstractFacade instance = null;
        int expResult = 0;
        int result = instance.count(filters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMergedEntity method, of class AbstractFacade.
     */
    @Test
    public void testGetMergedEntity() {
        System.out.println("getMergedEntity");
        Object entity = null;
        AbstractFacade instance = null;
        Object expResult = null;
        Object result = instance.getMergedEntity(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEntityManaged method, of class AbstractFacade.
     */
    @Test
    public void testIsEntityManaged() {
        System.out.println("isEntityManaged");
        Object entity = null;
        AbstractFacade instance = null;
        boolean expResult = false;
        boolean result = instance.isEntityManaged(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findWithParents method, of class AbstractFacade.
     */
    @Test
    public void testFindWithParents() {
        System.out.println("findWithParents");
        Object entity = null;
        AbstractFacade instance = null;
        Object expResult = null;
        Object result = instance.findWithParents(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractFacadeImpl extends AbstractFacade {

        public AbstractFacadeImpl() {
            super(null);
        }

        public EntityManager getEntityManager() {
            return null;
        }
    }
    
}
