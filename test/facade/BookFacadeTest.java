/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Book;
import garage.Maintenance;
import garage.User;
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
public class BookFacadeTest {
    
    public BookFacadeTest() {
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
     * Test of create method, of class BookFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class BookFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BookFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class BookFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        Book expResult = null;
        Book result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class BookFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        List<Book> expResult = null;
        List<Book> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class BookFacade.
     */
    @Test
    public void testFindRange_intArr() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        List<Book> expResult = null;
        List<Book> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class BookFacade.
     */
    @Test
    public void testCount_0args() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class BookFacade.
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
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        List<Book> expResult = null;
        List<Book> result = instance.findRange(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class BookFacade.
     */
    @Test
    public void testFindRange_4args() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        Map<String, String> sortFields = null;
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        List<Book> expResult = null;
        List<Book> result = instance.findRange(first, pageSize, sortFields, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class BookFacade.
     */
    @Test
    public void testCount_Map() throws Exception {
        System.out.println("count");
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        int expResult = 0;
        int result = instance.count(filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMergedEntity method, of class BookFacade.
     */
    @Test
    public void testGetMergedEntity() throws Exception {
        System.out.println("getMergedEntity");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        Book expResult = null;
        Book result = instance.getMergedEntity(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEntityManaged method, of class BookFacade.
     */
    @Test
    public void testIsEntityManaged() throws Exception {
        System.out.println("isEntityManaged");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        boolean expResult = false;
        boolean result = instance.isEntityManaged(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findWithParents method, of class BookFacade.
     */
    @Test
    public void testFindWithParents() throws Exception {
        System.out.println("findWithParents");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        Book expResult = null;
        Book result = instance.findWithParents(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserIdUserEmpty method, of class BookFacade.
     */
    @Test
    public void testIsUserIdUserEmpty() throws Exception {
        System.out.println("isUserIdUserEmpty");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        boolean expResult = false;
        boolean result = instance.isUserIdUserEmpty(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserIdUser method, of class BookFacade.
     */
    @Test
    public void testFindUserIdUser() throws Exception {
        System.out.println("findUserIdUser");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        User expResult = null;
        User result = instance.findUserIdUser(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVehicleIdVehicleEmpty method, of class BookFacade.
     */
    @Test
    public void testIsVehicleIdVehicleEmpty() throws Exception {
        System.out.println("isVehicleIdVehicleEmpty");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        boolean expResult = false;
        boolean result = instance.isVehicleIdVehicleEmpty(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findVehicleIdVehicle method, of class BookFacade.
     */
    @Test
    public void testFindVehicleIdVehicle() throws Exception {
        System.out.println("findVehicleIdVehicle");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        Vehicle expResult = null;
        Vehicle result = instance.findVehicleIdVehicle(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMaintenanceListEmpty method, of class BookFacade.
     */
    @Test
    public void testIsMaintenanceListEmpty() throws Exception {
        System.out.println("isMaintenanceListEmpty");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        boolean expResult = false;
        boolean result = instance.isMaintenanceListEmpty(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMaintenanceList method, of class BookFacade.
     */
    @Test
    public void testFindMaintenanceList() throws Exception {
        System.out.println("findMaintenanceList");
        Book entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BookFacade instance = (BookFacade)container.getContext().lookup("java:global/classes/BookFacade");
        List<Maintenance> expResult = null;
        List<Maintenance> result = instance.findMaintenanceList(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
