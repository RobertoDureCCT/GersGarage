/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.Date;
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
public class BookTest {
    
    public BookTest() {
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
     * Test of getIdbook method, of class Book.
     */
    @Test
    public void testGetIdbook() {
        System.out.println("getIdbook");
        Book instance = new Book();
        Integer expResult = null;
        Integer result = instance.getIdbook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdbook method, of class Book.
     */
    @Test
    public void testSetIdbook() {
        System.out.println("setIdbook");
        Integer idbook = null;
        Book instance = new Book();
        instance.setIdbook(idbook);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getService method, of class Book.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setService method, of class Book.
     */
    @Test
    public void testSetService() {
        System.out.println("setService");
        String service = "";
        Book instance = new Book();
        instance.setService(service);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Book.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Book instance = new Book();
        Integer expResult = null;
        Integer result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Book.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Integer user = null;
        Book instance = new Book();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVehicle method, of class Book.
     */
    @Test
    public void testGetVehicle() {
        System.out.println("getVehicle");
        Book instance = new Book();
        Integer expResult = null;
        Integer result = instance.getVehicle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehicle method, of class Book.
     */
    @Test
    public void testSetVehicle() {
        System.out.println("setVehicle");
        Integer vehicle = null;
        Book instance = new Book();
        instance.setVehicle(vehicle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Book.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Book instance = new Book();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Book.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Book instance = new Book();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Book.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Book.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Book instance = new Book();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Book.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Book instance = new Book();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Book.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Book instance = new Book();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserIdUser method, of class Book.
     */
    @Test
    public void testGetUserIdUser() {
        System.out.println("getUserIdUser");
        Book instance = new Book();
        User expResult = null;
        User result = instance.getUserIdUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserIdUser method, of class Book.
     */
    @Test
    public void testSetUserIdUser() {
        System.out.println("setUserIdUser");
        User userIdUser = null;
        Book instance = new Book();
        instance.setUserIdUser(userIdUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVehicleIdVehicle method, of class Book.
     */
    @Test
    public void testGetVehicleIdVehicle() {
        System.out.println("getVehicleIdVehicle");
        Book instance = new Book();
        Vehicle expResult = null;
        Vehicle result = instance.getVehicleIdVehicle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVehicleIdVehicle method, of class Book.
     */
    @Test
    public void testSetVehicleIdVehicle() {
        System.out.println("setVehicleIdVehicle");
        Vehicle vehicleIdVehicle = null;
        Book instance = new Book();
        instance.setVehicleIdVehicle(vehicleIdVehicle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaintenanceList method, of class Book.
     */
    @Test
    public void testGetMaintenanceList() {
        System.out.println("getMaintenanceList");
        Book instance = new Book();
        List<Maintenance> expResult = null;
        List<Maintenance> result = instance.getMaintenanceList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaintenanceList method, of class Book.
     */
    @Test
    public void testSetMaintenanceList() {
        System.out.println("setMaintenanceList");
        List<Maintenance> maintenanceList = null;
        Book instance = new Book();
        instance.setMaintenanceList(maintenanceList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Book.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Book instance = new Book();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Book.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Book instance = new Book();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Book instance = new Book();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
