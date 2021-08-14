/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

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
public class InvoiceTest {
    
    public InvoiceTest() {
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
     * Test of getIdInvoice method, of class Invoice.
     */
    @Test
    public void testGetIdInvoice() {
        System.out.println("getIdInvoice");
        Invoice instance = new Invoice();
        Integer expResult = null;
        Integer result = instance.getIdInvoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdInvoice method, of class Invoice.
     */
    @Test
    public void testSetIdInvoice() {
        System.out.println("setIdInvoice");
        Integer idInvoice = null;
        Invoice instance = new Invoice();
        instance.setIdInvoice(idInvoice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaintenanceDescription method, of class Invoice.
     */
    @Test
    public void testGetMaintenanceDescription() {
        System.out.println("getMaintenanceDescription");
        Invoice instance = new Invoice();
        String expResult = "";
        String result = instance.getMaintenanceDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaintenanceDescription method, of class Invoice.
     */
    @Test
    public void testSetMaintenanceDescription() {
        System.out.println("setMaintenanceDescription");
        String maintenanceDescription = "";
        Invoice instance = new Invoice();
        instance.setMaintenanceDescription(maintenanceDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Invoice.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Invoice instance = new Invoice();
        String expResult = "";
        String result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Invoice.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        String amount = "";
        Invoice instance = new Invoice();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaintenanceIdMaintenance method, of class Invoice.
     */
    @Test
    public void testGetMaintenanceIdMaintenance() {
        System.out.println("getMaintenanceIdMaintenance");
        Invoice instance = new Invoice();
        Maintenance expResult = null;
        Maintenance result = instance.getMaintenanceIdMaintenance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaintenanceIdMaintenance method, of class Invoice.
     */
    @Test
    public void testSetMaintenanceIdMaintenance() {
        System.out.println("setMaintenanceIdMaintenance");
        Maintenance maintenanceIdMaintenance = null;
        Invoice instance = new Invoice();
        instance.setMaintenanceIdMaintenance(maintenanceIdMaintenance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Invoice.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Invoice instance = new Invoice();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Invoice.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Invoice instance = new Invoice();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Invoice.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Invoice instance = new Invoice();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
