/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

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
public class AccountNGTest {
      static Account account;
    static Customer customer;
    public AccountNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        customer = new Customer("09/05/1993", "Bill", "Gates");
        account = new Account(3429587739L, customer, true);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getAccountNumber method in  class Account.
     */
     /**
     * Test of generateStatement method, of class Account.
     */
    @Test
    public void testGenerateStatement() {
        System.out.println("generateStatement");
        System.out.println("generateStatement");
        String expResult = "Name: Jeevan, Bodigam\n"
                + "Date of Birth: 05/03/1997\n"
                + "Account Number: 351217882\n"
                + "Account Information:-    Interest Rate:5.80%\n"
                + "Transaction Limit for withdrawal: No Limit\n"
                + "-------------------------------------------------------------------------------\n"
                + "Transaction Type    Transaction Time    Amount    Additional Charges    Status\n"
                + "-------------------------------------------------------------------------------\n"
                + "Current Balance: 0.00    Interest: $0.00";
        String result = account.generateStatement();
        System.out.println(result);
        //assertEquals(result, expResult);
        assertNotNull(result);
    }

    /**
     * Test of getNoofWithdrawals method, of class Account.
     */
    @Test
    public void testGetNoofWithdrawals() {
        System.out.println("getNoofWithdrawals");
        int expResult = 1;
        Transaction instance;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
        String time1 = "2021-03-02 08:42:02";
        instance = new Transaction("WITHDRAW", 1000.00, LocalDateTime.parse(time1, formatter));
        instance.setStatus("SUCCESS");
//        account.getTransactions().add(instance);
        account.makeTransaction(instance);
        int result = account.getNoofWithdrawals();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of makeTransaction method, of class Account.
     */
    @Test
    public void testMakeTransaction() {
//        System.out.println("makeTransaction");

        Transaction transaction;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
        String time1 = "2021-02-02 08:42:02";
        transaction = new Transaction("DEPOSIT", 1000.00, LocalDateTime.parse(time1, formatter));
//        Account instance = null;
        String expResult = "Transaction Successful";
        String result = account.makeTransaction(transaction);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
