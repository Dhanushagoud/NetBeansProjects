/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author Dhanusha Dommati
 */
public interface Payable {
    public static final double FULL_SAL=750;
    public static final double TAX_RATE=12;
    public abstract double calcsal();
    public abstract double caltaxrate();
    public abstract double calSalAfterTaxes();
    
    
    
}
