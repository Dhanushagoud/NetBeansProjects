/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Que6UncheckedExeption;

import static java.awt.SystemColor.text;

/**
 *
 * @author DhanushaDommati
 */
public class UncheckedExpectionExample02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { 
        // TODO code application logic here
        
        
        try {
            String text = null;
            System.out.println(text.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("The text can't be null");
        }

    }
}
    
    

