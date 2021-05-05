/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
import enums.TransactionType;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The driver class to test all the classes
 * @author DhanushaDommati
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner scan = new Scanner(new File("input.txt"));
        while (scan.hasNext()) {
            String name = scan.nextLine();
            String Fname = scan.next();
            String Lname = scan.nextLine().trim();
            String DOB = scan.nextLine();
            Customer C = new Customer(DOB, Fname, Lname);
            Account A;

            if (name.equalsIgnoreCase("SAVINGS")) {
                Long acc = scan.nextLong();
                boolean wd = scan.nextBoolean();
                A = new SavingsAccount(C, acc, wd);
            } else {
                Long acc = scan.nextLong();
                A = new CurrentAccount(C, acc);
            }

            System.out.println("------------------------------------------------------------");
            System.out.println("Name of the customer: " + C.getFirstName() + "  " + C.getLastName());
            System.out.println("------------------------------------------------------------");
            while (scan.hasNext("DEPOSIT") || scan.hasNext("WITHDRAW") || scan.hasNext("ONLINEPURCHASE")) {
                String transacType = scan.next();

                double amount = scan.nextDouble();
                scan.skip("\\s*");
                String datetime = scan.nextLine().replaceAll("-", "/");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d HH:m:s");
                LocalDateTime date = LocalDateTime.parse(datetime, formatter);
                Transaction T = new Transaction(TransactionType.valueOf(transacType), amount, date);

                try {
                    double balance = A.makeTransaction(T);
                    System.out.println("The balance after " + transacType + " in dollars is " + String.format("%.2f", Math.round(balance * 100) / 100.0));
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            accounts.add(A);
        }

        System.out.println("*************************************************"
                + "***********************\n"
                + "*********Invoke getNoofWithdrawals() on SavingsAccount objects**"
                + "********\n"
                + "*********************************************************"
                + "***************");
        for (Account ac : accounts) {
            if (ac instanceof SavingsAccount) {
                System.out.println(ac.getCustomer().getFirstName() + " made "
                        + ((SavingsAccount) ac).getNoofWithdrawals() + " withdrawals in this month.");
            }
        }
        System.out.println("***************************************************"
                + "********************\n"
                + "****Invoke generateStatement() on all objects in accounts"
                + " ArrayList****\n"
                + "*********************************************************"
                + "***************");
        for (Account ac : accounts) {
            System.out.println(ac.generateStatement());
        }
    }
}

        
    
    

