/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Class: 44542-02 Object Oriented Programming
 *
 * @author Dhanusha Dommati Description: Making sure everything works Due:
 * 03/17/2021 I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or any source. I
 * have not given my code to any other student and will not share this code with
 * anyone under my circumstances.
 */
public class TransactionNGTest {
    
    public TransactionNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of toString method in class Transaction.
     */
    @Test
    public void testToString() {
//        System.out.println("toString");
       Transaction instance;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
        String time1 = "2021-02-02 08:42:02";
        instance = new Transaction("DEPOSIT", 1000.00,LocalDateTime.parse(time1, formatter));
        instance.setStatus("SUCCESS");
        DecimalFormat df = new DecimalFormat("#0.00");
        String expResult = "DEPOSIT             2021-02-02T08:42:02         1000.00      0.00   SUCCESS  ";
        String result = instance.toString();
        assertEquals(result.trim(), expResult.trim());
        
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
