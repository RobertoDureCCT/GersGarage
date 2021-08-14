/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import garage.Book;
import garage.Invoice;
import garage.Maintenance;
import garage.Supply;
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
public class MaintenanceFacadeTest {
    
    public MaintenanceFacadeTest() {
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
     * Test of create method, of class MaintenanceFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class MaintenanceFacade.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MaintenanceFacade.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class MaintenanceFacade.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        Maintenance expResult = null;
        Maintenance result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class MaintenanceFacade.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        List<Maintenance> expResult = null;
        List<Maintenance> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class MaintenanceFacade.
     */
    @Test
    public void testFindRange_intArr() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        List<Maintenance> expResult = null;
        List<Maintenance> result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class MaintenanceFacade.
     */
    @Test
    public void testCount_0args() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class MaintenanceFacade.
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
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        List<Maintenance> expResult = null;
        List<Maintenance> result = instance.findRange(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class MaintenanceFacade.
     */
    @Test
    public void testFindRange_4args() throws Exception {
        System.out.println("findRange");
        int first = 0;
        int pageSize = 0;
        Map<String, String> sortFields = null;
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        List<Maintenance> expResult = null;
        List<Maintenance> result = instance.findRange(first, pageSize, sortFields, filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class MaintenanceFacade.
     */
    @Test
    public void testCount_Map() throws Exception {
        System.out.println("count");
        Map<String, Object> filters = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        int expResult = 0;
        int result = instance.count(filters);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMergedEntity method, of class MaintenanceFacade.
     */
    @Test
    public void testGetMergedEntity() throws Exception {
        System.out.println("getMergedEntity");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        Maintenance expResult = null;
        Maintenance result = instance.getMergedEntity(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEntityManaged method, of class MaintenanceFacade.
     */
    @Test
    public void testIsEntityManaged() throws Exception {
        System.out.println("isEntityManaged");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        boolean expResult = false;
        boolean result = instance.isEntityManaged(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSupplyListEmpty method, of class MaintenanceFacade.
     */
    @Test
    public void testIsSupplyListEmpty() throws Exception {
        System.out.println("isSupplyListEmpty");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        boolean expResult = false;
        boolean result = instance.isSupplyListEmpty(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findSupplyList method, of class MaintenanceFacade.
     */
    @Test
    public void testFindSupplyList() throws Exception {
        System.out.println("findSupplyList");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        List<Supply> expResult = null;
        List<Supply> result = instance.findSupplyList(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInvoiceListEmpty method, of class MaintenanceFacade.
     */
    @Test
    public void testIsInvoiceListEmpty() throws Exception {
        System.out.println("isInvoiceListEmpty");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        boolean expResult = false;
        boolean result = instance.isInvoiceListEmpty(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findInvoiceList method, of class MaintenanceFacade.
     */
    @Test
    public void testFindInvoiceList() throws Exception {
        System.out.println("findInvoiceList");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        List<Invoice> expResult = null;
        List<Invoice> result = instance.findInvoiceList(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBookIdbookEmpty method, of class MaintenanceFacade.
     */
    @Test
    public void testIsBookIdbookEmpty() throws Exception {
        System.out.println("isBookIdbookEmpty");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        boolean expResult = false;
        boolean result = instance.isBookIdbookEmpty(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBookIdbook method, of class MaintenanceFacade.
     */
    @Test
    public void testFindBookIdbook() throws Exception {
        System.out.println("findBookIdbook");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        Book expResult = null;
        Book result = instance.findBookIdbook(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findWithParents method, of class MaintenanceFacade.
     */
    @Test
    public void testFindWithParents() throws Exception {
        System.out.println("findWithParents");
        Maintenance entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        MaintenanceFacade instance = (MaintenanceFacade)container.getContext().lookup("java:global/classes/MaintenanceFacade");
        Maintenance expResult = null;
        Maintenance result = instance.findWithParents(entity);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
