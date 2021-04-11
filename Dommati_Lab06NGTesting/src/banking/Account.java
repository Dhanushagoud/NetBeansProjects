/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Class: 44542-02 Object Oriented Programming
 *
 * @author Dhanusha Dommati Description: Making sure everything works Due:
 * 03/17/2021 I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or any source. I
 * have not given my code to any other student and will not share this code with
 * anyone under my circumstances.
 */
public class Account {

    private long accountNumber;
    private Customer customer;
    private double balance;
    private ArrayList<Transaction> transactions;
    private boolean hasLimitedWithdrawals;

    public static final double SAVING_INTEREST = 5.80;

    /**
     *
     * @param accountNumber this is accountNumber
     * @param customer this is customer
     * @param hasLimitedWithdrawals this is hasLimitedWithdrawals
     */
    public Account(long accountNumber, Customer customer, boolean hasLimitedWithdrawals) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
        transactions = new ArrayList<>();
    }

    /**
     * gives the AccountNumber
     *
     * @return AccountNumber
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * gives the Customer
     *
     * @return Customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * gives the Balance
     *
     * @return Balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * geta the ArrayList Transaction
     *
     * @return Transaction
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * gets the HasLimitedWithdrawals
     *
     * @return HasLimitedWithdrawals
     */
    public boolean isHasLimitedWithdrawals() {
        return hasLimitedWithdrawals;
    }

    /**
     * gets the SAVING_INTEREST
     *
     * @return SAVING_INTEREST
     */
    public static double getSAVING_INTEREST() {
        return SAVING_INTEREST;
    }

    /**
     * sets the accountNumber
     *
     * @param accountNumber
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * sets the customer
     *
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * sets the balance
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * sets the transactions
     *
     * @param transactions
     */
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * sets the hasLimitedWithdrawals
     *
     * @param hasLimitedWithdrawals
     */
    public void setHasLimitedWithdrawals(boolean hasLimitedWithdrawals) {
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
    }

    /**
     * represents the String
     *
     * @return the accountNumber,accountInformation,Transaction Limit for
     * withdrawal
     */
    public String generateStatement() {

        DecimalFormat df = new DecimalFormat("#0.00");
        String customerDetails = customer.toString();
        String accountInfo = "Account Number: " + this.accountNumber + "\nAccount Information:-	Interest Rate: "
                + df.format(SAVING_INTEREST) + "%"
                + "\nTransaction Limit for withdrawal: " + (!this.hasLimitedWithdrawals ? "No Limit" : "7 Transactions");
        String dummy = customerDetails
                + "\n" + accountInfo
                + "\n-------------------------------------------------------------------------------\n"
                + "Transaction Type    Transaction Time         Amount          Additional Charges       Status    ";
        String transactionString = "";
        for (Transaction trans : transactions) {
            transactionString += trans.toString();
        }
        return dummy + transactionString
                + "\n-------------------------------------------------------------------------------\n"
                + "Current Balance: " + df.format(Math.round(this.getBalance() * 100) / 100.0) + "		Interest: $" + df.format(Math.round((this.getBalance() * (SAVING_INTEREST / 100)) * 100) / 100.0)
                + "\n************************************************************************";
    }

    /**
     * gets the NoofWithdrawals
     *
     * @return NoofWithdrawals
     */
    public int getNoofWithdrawals() {
        int noOfWithdrawalTransactions = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionType().equalsIgnoreCase("WITHDRAW")
                    && transaction.getTransactionTime().getMonthValue() == LocalDateTime.now().getMonthValue()) {
                noOfWithdrawalTransactions++;
            }
        }
        return noOfWithdrawalTransactions;
    }

    /**
     * makes the Transaction
     *
     * @param transaction
     * @return
     */
    public String makeTransaction(Transaction transaction) {
        this.transactions.add(transaction);
        String transactionStatus = "";
        if ((transaction.getTransactionType().equals("WITHDRAW") || transaction.getTransactionType().equals("ONLINEPURCHASE")) && transaction.getAmount() > this.balance) {
            transaction.setAdditionalCharges(0);
            transaction.setStatus("FAILED");
            transactionStatus = "Insufficient Balance";
        } else if (transaction.getTransactionType().equals("DEPOSIT")) {
            transaction.setAdditionalCharges(0);
            transaction.setStatus("SUCCESS");
            this.setBalance(balance + transaction.getAmount());
            transactionStatus = "Transaction Successful";
        } else if (transaction.getTransactionType().equals("ONLINEPURCHASE")) {
            transaction.setAdditionalCharges(1.99);
            transaction.setStatus("SUCCESS");
            this.setBalance(balance - (transaction.getAmount() + transaction.getAdditionalCharges()));
            transactionStatus = "Transaction Successful";
        } else if (transaction.getTransactionType().equals("WITHDRAW")) {
            if (hasLimitedWithdrawals) {
                if (this.getNoofWithdrawals() > 6) {
                    transaction.setAdditionalCharges(0);
                    transaction.setStatus("FAILED");
                    transactionStatus = "MaxTransactions";
                }
                if (this.getNoofWithdrawals() <= 6) {
                    transaction.setAdditionalCharges(0);
                    transaction.setStatus("SUCCESS");
                    this.setBalance(balance - transaction.getAmount());
                    transactionStatus = "Transaction Successful";
                }
            } else {
                if (this.getNoofWithdrawals() > 6) {
                    double additionalChrgs = Math.max(2.59, transaction.getAmount() * 1 / 100.0);
                    transaction.setAdditionalCharges(additionalChrgs);
                    transaction.setStatus("SUCCESS");
                    setBalance(this.balance - (transaction.getAmount() + additionalChrgs));
                    transactionStatus = "Transaction Successful";
                }
                if (this.getNoofWithdrawals() <= 6) {
                    transaction.setAdditionalCharges(0);
                    transaction.setStatus("SUCCESS");
                    setBalance(balance - transaction.getAmount());
                    transactionStatus = "Transaction Successful";
                }
            }

        }

        return transactionStatus;

    }
}
