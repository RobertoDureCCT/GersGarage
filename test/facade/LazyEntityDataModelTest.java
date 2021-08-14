/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

/**
 *
 * @author roberto
 */
public class LazyEntityDataModelTest {
    
    public LazyEntityDataModelTest() {
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
     * Test of load method, of class LazyEntityDataModel.
     */
    @Test
    public void testLoad_5args() {
        System.out.println("load");
        int first = 0;
        int pageSize = 0;
        String sortField = "";
        SortOrder sortOrder = null;
        Map<String, Object> filters = null;
        LazyEntityDataModel instance = null;
        List expResult = null;
        List result = instance.load(first, pageSize, sortField, sortOrder, filters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class LazyEntityDataModel.
     */
    @Test
    public void testLoad_4args() {
        System.out.println("load");
        int first = 0;
        int pageSize = 0;
        List<SortMeta> multiSortMeta = null;
        Map<String, Object> filters = null;
        LazyEntityDataModel instance = null;
        List expResult = null;
        List result = instance.load(first, pageSize, multiSortMeta, filters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowKey method, of class LazyEntityDataModel.
     */
    @Test
    public void testGetRowKey() {
        System.out.println("getRowKey");
        Object object = null;
        LazyEntityDataModel instance = null;
        Object expResult = null;
        Object result = instance.getRowKey(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRowData method, of class LazyEntityDataModel.
     */
    @Test
    public void testGetRowData() {
        System.out.println("getRowData");
        String rowKey = "";
        LazyEntityDataModel instance = null;
        Object expResult = null;
        Object result = instance.getRowData(rowKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
