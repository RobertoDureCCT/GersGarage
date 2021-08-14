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
public class VehicleTest {
    
    public VehicleTest() {
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
     * Test of getIdVehicle method, of class Vehicle.
     */
    @Test
    public void testGetIdVehicle() {
        System.out.println("getIdVehicle");
        Vehicle instance = new Vehicle();
        Integer expResult = null;
        Integer result = instance.getIdVehicle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdVehicle method, of class Vehicle.
     */
    @Test
    public void testSetIdVehicle() {
        System.out.println("setIdVehicle");
        Integer idVehicle = null;
        Vehicle instance = new Vehicle();
        instance.setIdVehicle(idVehicle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMake method, of class Vehicle.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        Vehicle instance = new Vehicle();
        String expResult = "";
        String result = instance.getMake();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMake method, of class Vehicle.
     */
    @Test
    public void testSetMake() {
        System.out.println("setMake");
        String make = "";
        Vehicle instance = new Vehicle();
        instance.setMake(make);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class Vehicle.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        Vehicle instance = new Vehicle();
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class Vehicle.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        Vehicle instance = new Vehicle();
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEngine method, of class Vehicle.
     */
    @Test
    public void testGetEngine() {
        System.out.println("getEngine");
        Vehicle instance = new Vehicle();
        String expResult = "";
        String result = instance.getEngine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEngine method, of class Vehicle.
     */
    @Test
    public void testSetEngine() {
        System.out.println("setEngine");
        String engine = "";
        Vehicle instance = new Vehicle();
        instance.setEngine(engine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicence method, of class Vehicle.
     */
    @Test
    public void testGetLicence() {
        System.out.println("getLicence");
        Vehicle instance = new Vehicle();
        Integer expResult = null;
        Integer result = instance.getLicence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicence method, of class Vehicle.
     */
    @Test
    public void testSetLicence() {
        System.out.println("setLicence");
        Integer licence = null;
        Vehicle instance = new Vehicle();
        instance.setLicence(licence);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBookList method, of class Vehicle.
     */
    @Test
    public void testGetBookList() {
        System.out.println("getBookList");
        Vehicle instance = new Vehicle();
        List<Book> expResult = null;
        List<Book> result = instance.getBookList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBookList method, of class Vehicle.
     */
    @Test
    public void testSetBookList() {
        System.out.println("setBookList");
        List<Book> bookList = null;
        Vehicle instance = new Vehicle();
        instance.setBookList(bookList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Vehicle.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Vehicle instance = new Vehicle();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Vehicle.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Vehicle instance = new Vehicle();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehicle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehicle instance = new Vehicle();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
