/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
import enums.TransactionType;
import java.time.LocalDateTime;


/**
 *This class contains the details of a transaction made on an account.
 * @author DhanushaDommati
 */
public class Transaction {
 private double additionalCharges;
    private double amount;
    private String status;
    private LocalDateTime trannsactonTime;
    private TransactionType transactionType;

    /**
     *the Constructor with 3 arguments
     * @param transactionType Type of the transaction
     * @param amount 
     * @param transactonTime Time takes for the transaction
     */
    public Transaction(TransactionType transactionType, double amount,
            LocalDateTime transactonTime) {
        this.amount = amount;
        this.trannsactonTime = transactonTime;
        this.transactionType = transactionType;
    }

    /**
     * Gets gives the additional charges
     * @return Additional Charges
     */
    public double getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * Gets gives the Amount
     * @return Amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets gives the Status
     *
     * @return Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets gives the Time of the Transaction
     * @return Time of the transaction
     */
    public LocalDateTime getTrannsactonTime() {
        return trannsactonTime;
    }

    /**
     * Gets gives type of the transaction
     * @return Type of the transaction
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets additional charges
     * @param additionalCharges Additional Charges
     */
    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /**
     * Sets status
     * @param status status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * toString
     * @return transactionType,amount,additionalCharges,status
     */
    @Override
    public String toString() {
        //return transactionType+"\t\t"+trannsactonTime+"\t"+amount+"\t\t"+additionalCharges+"\t\t"+status;
        return String.format("%-17s", transactionType) + String.format("%-20s", trannsactonTime) + "$" + String.format("%-10s", String.format("%.2f", amount)) + "$" + String.format("%-19s", String.format("%.2f", additionalCharges)) + status;
    }

}

   
    

