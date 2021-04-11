/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

/**
 *Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/17/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code 
 * with anyone under my circumstances.
 */
public class Transaction {
    private double additionalCharges;
    private double amount;
    private String status;
    private LocalDateTime transactionTime;
    private String transactionType;

    /**
     *
     * @param amount this is amount
     * @param transactionTime this is transactionTime
     * @param  transactionType this is transactionType
     */
    public Transaction(String transactionType,double amount,LocalDateTime transactionTime) {
        this.amount = amount;
        this.transactionTime = transactionTime;
        this.transactionType = transactionType;
    }

   
   

    /**
     *gives the AdditionalCharges
     * @return AdditionalCharges
     */
    public double getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     *gives the Amount
     * @return Amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     *gives the status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     *gives the TransactionTime
     * @return TransactionTime
     */
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     *gives the TransactionType
     * @return TransactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     *sets the additionalCharges
     * @param additionalCharges
     */
    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /**
     *sets the Amount
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     *sets the status
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *sets the transactionTime
     * @param transactionTime
     */
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     *sets the transactionType
     * @param transactionType
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     *represents the Strings
     * @return transactionType,transactionTime,amount,additionalCharges,status
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "\n" + this.transactionType +"             "
                + this.transactionTime +"      " + df.format(this.amount) +"         " +
                df.format(this.additionalCharges)+"\n" +this.status;     
        
    }
    
    
    
}
