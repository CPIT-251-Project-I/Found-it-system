/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author noran
 */
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getDescription method, of class Item.
     */
    @Ignore
    public void testGetDescription() {
        System.out.println("getDescription");
        Item instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Item.
     */
    @Ignore
    public void testSetDescription() {
        System.out.println("setDescription");
        String Description = "";
        Item instance = null;
        instance.setDescription(Description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareDescription method, of class Item.
     */
    @Ignore
    public void testCompareDescription() {
        System.out.println("compareDescription");
        ArrayList<FoundItem> founditem = null;
        Item.compareDescription(founditem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MatchingFoundItemInfo method, of class Item.
     */
    @Test (timeout = 10)
    public void testMatchingFoundItemInfo() {
        System.out.println("MatchingFoundItemInfo");
        String word = "iphone";
        SecurityCenter SecurityCenter = new SecurityCenter("FCIT");
        FoundItem Founditem = new FoundItem(SecurityCenter, "iphone");
        FoundItem expResult = Founditem;
        FoundItem result = Item.MatchingFoundItemInfo(word, Founditem);
        assertEquals(expResult, result);
    }

    /**
     * Test of displayMatchingFoundItemInfo method, of class Item.
     */
    @Ignore
    public void testDisplayMatchingFoundItemInfo() {
        System.out.println("displayMatchingFoundItemInfo");
        FoundItem foundItem = null;
        Item.displayMatchingFoundItemInfo(foundItem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparePhoto method, of class Item.
     */
    @Ignore
    public void testComparePhoto() {
        System.out.println("comparePhoto");
        Item instance = null;
        instance.comparePhoto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
