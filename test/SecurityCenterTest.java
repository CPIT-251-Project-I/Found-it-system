/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;
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
public class SecurityCenterTest {
    
    public SecurityCenterTest() {
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
     * Test of getSecurityLocation method, of class SecurityCenter.
     */
    @Ignore
    public void testGetSecurityLocation() {
        System.out.println("getSecurityLocation");
        SecurityCenter instance = null;
        String expResult = "";
        String result = instance.getSecurityLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecurityLocation method, of class SecurityCenter.
     */
    @Ignore
    public void testSetSecurityLocation() {
        System.out.println("setSecurityLocation");
        String securityLocation = "";
        SecurityCenter instance = null;
        instance.setSecurityLocation(securityLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ItemToEdit method, of class SecurityCenter.
     */
    @Ignore
    public void testItemToEdit() {
        System.out.println("ItemToEdit");
        ArrayList<FoundItem> founditem = null;
        SecurityCenter.ItemToEdit(founditem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerRecipientInfo method, of class SecurityCenter.
     */
    @Ignore
    public void testRegisterRecipientInfo() {
        System.out.println("registerRecipientInfo");
        FoundItem founditem = null;
        SecurityCenter.registerRecipientInfo(founditem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeItemStatus method, of class SecurityCenter.
     */
    @Ignore
    public void testChangeItemStatus() {
        System.out.println("changeItemStatus");
        FoundItem founditem = null;
        Scanner input = null;
        SecurityCenter.changeItemStatus(founditem, input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateItemInfo method, of class SecurityCenter.
     */
    @Test
    public void testUpdateItemInfo() {
        System.out.println("updateItemInfo");
        Student student = new Student("2102002","Noran");
        SecurityCenter SecurityCenter = new SecurityCenter("FCIT");
        FoundItem foundItem = new FoundItem(SecurityCenter, "Glasses");
        String expResult = "Recipient " + student.getName() + " with ID " + student.getID() + " successfully registered."
                + "\n_______________________________________________"
                + "\nThe Item has been received!";;
        String result = SecurityCenter.updateItemInfo(foundItem, student);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class SecurityCenter.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        SecurityCenter instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
