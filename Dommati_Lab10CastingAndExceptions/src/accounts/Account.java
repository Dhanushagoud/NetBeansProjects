/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
import interfaces.Operations;
import java.util.ArrayList;

/**
 *This abstract class contains attributes and methods of a bank account implementing the Operations.
 * @author DhanushaDommati
 */
public abstract class Account implements Operations{
     /**
     * Instance variable with name customer
     */
    public Customer customer;

    /**
     * Instance variable with name accountNumber
     */
    public long accountNumber;

    /**
     * Instance variable with name balance
     */
    public double balance;

    /**
     * Instance variable with name transactions
     */
    public ArrayList<Transaction> transactions;

    /**
     * Constructor with 2 arguments
     * @param customer Customer details
     * @param accountNumber Account Number
     */
    public Account(Customer customer, long accountNumber) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>();
    }

    /**
     * Gets gives the account number
     * @return account number
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets gives the Balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets gives the Customer Details
     * @return customer details
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets gives the transactions
     * @return transaction
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Abstract method name is makeTransaction
     * @param transaction Transaction
     * @return Final balance after making transaction
     * @throws Exception
     */
      @Override
    public abstract double makeTransaction(Transaction transaction) throws Exception;

    /**
     * toString
     * @return AccountNumber
     */
    @Override
    public String toString() {
        return customer.toString() + "\nAccount Number: " + accountNumber + "\n";
    }

    /**
     *It Generates the statement
     * @return the Statement
     */
    @Override
    public String generateStatement() {
        String s1 = "";
        String s2 = "--------------------------------------------"
                + "-----------------------------------\n"
                + String.format("%-17s", "Transaction Type")
                + String.format("%-20s", "Transaction Time")
                + String.format("%-7s", "Amount")
                + String.format("%-19s", "Additional Charges")
                + "Status\n";
        for (Transaction t : transactions) {
            s1 = s1 + t.toString() + "\n";
        }
        return s2 + s1 + "--------------"
                + "----------------------------------------------"
                + "-------------------";
    }

}

  