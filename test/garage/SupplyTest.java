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
public class SupplyTest {
    
    public SupplyTest() {
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
     * Test of getIdSupply method, of class Supply.
     */
    @Test
    public void testGetIdSupply() {
        System.out.println("getIdSupply");
        Supply instance = new Supply();
        Integer expResult = null;
        Integer result = instance.getIdSupply();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSupply method, of class Supply.
     */
    @Test
    public void testSetIdSupply() {
        System.out.println("setIdSupply");
        Integer idSupply = null;
        Supply instance = new Supply();
        instance.setIdSupply(idSupply);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Supply.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Supply instance = new Supply();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Supply.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Supply instance = new Supply();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrand method, of class Supply.
     */
    @Test
    public void testGetBrand() {
        System.out.println("getBrand");
        Supply instance = new Supply();
        String expResult = "";
        String result = instance.getBrand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrand method, of class Supply.
     */
    @Test
    public void testSetBrand() {
        System.out.println("setBrand");
        String brand = "";
        Supply instance = new Supply();
        instance.setBrand(brand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaintenanceList method, of class Supply.
     */
    @Test
    public void testGetMaintenanceList() {
        System.out.println("getMaintenanceList");
        Supply instance = new Supply();
        List<Maintenance> expResult = null;
        List<Maintenance> result = instance.getMaintenanceList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaintenanceList method, of class Supply.
     */
    @Test
    public void testSetMaintenanceList() {
        System.out.println("setMaintenanceList");
        List<Maintenance> maintenanceList = null;
        Supply instance = new Supply();
        instance.setMaintenanceList(maintenanceList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Supply.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Supply instance = new Supply();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Supply.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Supply instance = new Supply();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Supply.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Supply instance = new Supply();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
