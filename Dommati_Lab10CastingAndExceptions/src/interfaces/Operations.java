/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import accounts.Transaction;
/**
 *This package consists of interfaces of bank.
 * @author DhanushaDommati
 */
public interface Operations {
     static final double OVERDRAFT_LIMIT = 500.0;
    static final double SAVING_INTEREST = 5.8;

    public double makeTransaction(Transaction transaction) throws java.lang.Exception;

    public String generateStatement();
    
}
