/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: 44542-01 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/17/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code 
 * with anyone under my circumstances.
 */

public class BankDriver {

   /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */

   /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNext()) {
            String name = sc.nextLine();
            String Fname = sc.next(); 
            sc.skip("\\s*");
            String Lname = sc.nextLine();
            String DOB = sc.nextLine();
            
            long acc = sc.nextLong();
            
            sc.nextLine();
            boolean wd = sc.nextBoolean();
            
            sc.nextLine();

            Customer C = new Customer(DOB, Fname, Lname);

            //}
            Account A = new Account(acc, C, wd);
            System.out.println("------------------------------------------------------------");
            System.out.println("Name of the customer: " + C.getFirstName() + "  " + C.getLastName());
            System.out.println("------------------------------------------------------------");
            while (!(sc.hasNext("newAccount"))) {
                String transacType = sc.next();
                double amount = sc.nextDouble();
                sc.skip("\\s*");
                String transacTime = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
                LocalDateTime date = LocalDateTime.parse(transacTime, formatter);
                

                Transaction T = new Transaction(transacType,amount,date);
                String W = A.makeTransaction(T);
                if (W.equalsIgnoreCase("Transaction Successful")) {
                    double res1 = (Math.round(A.getBalance() * 100)) / 100.0;
                    System.out.println("The balance after" + " " + transacType + " "
                            + "in dollars is" + " " + String.format("%.2f", res1));
                } else if (W.equalsIgnoreCase("MaxTransactions")) {
                    System.out.println("Exceeded number of withdrawals "
                            + "transactions."
                            + " Number of available withdrawals per month: 6");
                } else if (W.equalsIgnoreCase("Insufficient Balance")) {
                    double res = (Math.round(A.getBalance() * 100)) / 100.0;
                    System.out.println("Insufficient funds. Available funds: "
                            + String.format("%.2f", res));
                }

                if (sc.hasNext()) {
                    continue;
                } else {
                    break;
                }
            }

            accounts.add(A);
        }

        System.out.println("*******"
                + "***\n"
                + "*Invoke getNoofWithdrawals() on Account objects"
                + "**\n"
                + "*******"
                + "***");
        for (Account ac : accounts) {
            System.out.println(ac.getCustomer().getFirstName() + " made " + 
                    ac.getNoofWithdrawals() + " withdrawals in this month.");
            //System.out.println(ac.);
        }

        System.out.println("*******"
                + "****\n"
                + "**Invoke generateStatement() on all objects in accounts"
                + " ArrayList**\n"
                + "*******"
                + "***");
        //ArrayList<Transaction> t = new ArrayList<>();
        for (Account ac : accounts) {
            System.out.println(ac.generateStatement());
        }

    }
}
