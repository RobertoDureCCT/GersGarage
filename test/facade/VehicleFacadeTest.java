/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Book;
import garage.Vehicle;
import java.util.List;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
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
public class VehicleFacadeTest {
    
    public VehicleFacadeTest() {
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
     * Test of create method, of class VehicleFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class VehicleFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class VehicleFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class VehicleFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        Vehicle expResult = null;
        Vehicle result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class VehicleFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        List<Vehicle> expResult = null;
        List<Vehicle> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class VehicleFacade.
     */
    @Test
    public void testFindRange_intArr() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        List<Vehicle> expResult = null;
        List<Vehicle> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class VehicleFacade.
     */
    @Test
    public void testCount_0args() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class VehicleFacade.
     */
    @Test
    public void testFindRange_5args() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        String sortField = "";
        String sortOrder = "";
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        List<Vehicle> expResult = null;
        List<Vehicle> result = instance.findRange(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class VehicleFacade.
     */
    @Test
    public void testFindRange_4args() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        Map<String, String> sortFields = null;
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        List<Vehicle> expResult = null;
        List<Vehicle> result = instance.findRange(first, pageSize, sortFields, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class VehicleFacade.
     */
    @Test
    public void testCount_Map() throws Exception {
        System.out.println("count");
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        int expResult = 0;
        int result = instance.count(filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMergedEntity method, of class VehicleFacade.
     */
    @Test
    public void testGetMergedEntity() throws Exception {
        System.out.println("getMergedEntity");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        Vehicle expResult = null;
        Vehicle result = instance.getMergedEntity(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEntityManaged method, of class VehicleFacade.
     */
    @Test
    public void testIsEntityManaged() throws Exception {
        System.out.println("isEntityManaged");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        boolean expResult = false;
        boolean result = instance.isEntityManaged(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findWithParents method, of class VehicleFacade.
     */
    @Test
    public void testFindWithParents() throws Exception {
        System.out.println("findWithParents");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        Vehicle expResult = null;
        Vehicle result = instance.findWithParents(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBookListEmpty method, of class VehicleFacade.
     */
    @Test
    public void testIsBookListEmpty() throws Exception {
        System.out.println("isBookListEmpty");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        boolean expResult = false;
        boolean result = instance.isBookListEmpty(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBookList method, of class VehicleFacade.
     */
    @Test
    public void testFindBookList() throws Exception {
        System.out.println("findBookList");
        Vehicle entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VehicleFacade instance = (VehicleFacade)container.getContext().lookup("java:global/classes/VehicleFacade");
        List<Book> expResult = null;
        List<Book> result = instance.findBookList(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
