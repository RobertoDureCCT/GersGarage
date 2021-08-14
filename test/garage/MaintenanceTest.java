/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.List;
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
public class MaintenanceTest {
    
    public MaintenanceTest() {
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
     * Test of getIdMaintenance method, of class Maintenance.
     */
    @Test
    public void testGetIdMaintenance() {
        System.out.println("getIdMaintenance");
        Maintenance instance = new Maintenance();
        Integer expResult = null;
        Integer result = instance.getIdMaintenance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMaintenance method, of class Maintenance.
     */
    @Test
    public void testSetIdMaintenance() {
        System.out.println("setIdMaintenance");
        Integer idMaintenance = null;
        Maintenance instance = new Maintenance();
        instance.setIdMaintenance(idMaintenance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Maintenance.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Maintenance instance = new Maintenance();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Maintenance.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        Maintenance instance = new Maintenance();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Maintenance.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Maintenance instance = new Maintenance();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Maintenance.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Maintenance instance = new Maintenance();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Maintenance.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Maintenance instance = new Maintenance();
        Boolean expResult = null;
        Boolean result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Maintenance.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Boolean status = null;
        Maintenance instance = new Maintenance();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupplyList method, of class Maintenance.
     */
    @Test
    public void testGetSupplyList() {
        System.out.println("getSupplyList");
        Maintenance instance = new Maintenance();
        List<Supply> expResult = null;
        List<Supply> result = instance.getSupplyList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSupplyList method, of class Maintenance.
     */
    @Test
    public void testSetSupplyList() {
        System.out.println("setSupplyList");
        List<Supply> supplyList = null;
        Maintenance instance = new Maintenance();
        instance.setSupplyList(supplyList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvoiceList method, of class Maintenance.
     */
    @Test
    public void testGetInvoiceList() {
        System.out.println("getInvoiceList");
        Maintenance instance = new Maintenance();
        List<Invoice> expResult = null;
        List<Invoice> result = instance.getInvoiceList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInvoiceList method, of class Maintenance.
     */
    @Test
    public void testSetInvoiceList() {
        System.out.println("setInvoiceList");
        List<Invoice> invoiceList = null;
        Maintenance instance = new Maintenance();
        instance.setInvoiceList(invoiceList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookIdbook method, of class Maintenance.
     */
    @Test
    public void testGetBookIdbook() {
        System.out.println("getBookIdbook");
        Maintenance instance = new Maintenance();
        Book expResult = null;
        Book result = instance.getBookIdbook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBookIdbook method, of class Maintenance.
     */
    @Test
    public void testSetBookIdbook() {
        System.out.println("setBookIdbook");
        Book bookIdbook = null;
        Maintenance instance = new Maintenance();
        instance.setBookIdbook(bookIdbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Maintenance.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Maintenance instance = new Maintenance();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Maintenance.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Maintenance instance = new Maintenance();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Maintenance.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Maintenance instance = new Maintenance();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
