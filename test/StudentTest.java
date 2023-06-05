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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getID method, of class Student.
     */
    @Ignore
    public void testGetID() {
        System.out.println("getID");
        Student instance = null;
        String expResult = "";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Student.
     */
    @Ignore
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        Student instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Ignore
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Ignore
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMissingItem method, of class Student.
     */
     @Test (timeout = 70)
    public void testAddMissingItem() {
        System.out.println("addMissingItem");
        ArrayList<LostItem> lostItemArray = new ArrayList<LostItem>();
        LostItem newLostItem = new LostItem("FCIT","0567478675","MacBook");
        String expResult = "Your missing item was successfully added to the system.";
        String result = Student.addMissingItem(newLostItem, lostItemArray);
        assertEquals(expResult, result);
    }

    /**
     * Test of addMissingItem method, of class Student.
     */
    @Test (timeout = 70)
    public void testAddFoundItem() {
        System.out.println("addFoundItem");
        ArrayList<FoundItem> founditem = new ArrayList<FoundItem>();
        SecurityCenter SecurityCenter = new SecurityCenter("FCIT");
        FoundItem newFounditem = new FoundItem(SecurityCenter, "iphone");
        String expResult = "the found item was successfully added to the system.";
        String result = Student.addFoundItem(founditem, newFounditem);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchByDescription method, of class Student.
     */
    @Ignore
    public void testSearchByDescription() {
        System.out.println("searchByDescription");
        String expResult = "";
        String result = Student.searchByDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByPhoto method, of class Student.
     */
    @Ignore
    public void testSearchByPhoto() {
        System.out.println("searchByPhoto");
        Student.searchByPhoto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Student instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
