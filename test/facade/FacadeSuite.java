/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author roberto
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({facade.MaintenanceFacadeTest.class, facade.AbstractFacadeTest.class, facade.LazyEntityDataModelTest.class, facade.BookFacadeTest.class, facade.InvoiceFacadeTest.class, facade.UserFacadeTest.class, facade.LazyEntitySorterTest.class, facade.EntityUtilityTest.class, facade.VehicleFacadeTest.class, facade.SupplyFacadeTest.class})
public class FacadeSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
