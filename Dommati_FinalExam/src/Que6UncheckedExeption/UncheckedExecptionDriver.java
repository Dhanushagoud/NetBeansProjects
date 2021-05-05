/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Que6UncheckedExeption;

/**
 *
 * @author DhanushaDommati
 */
public class UncheckedExecptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        int[] array = new int[]{1, 2, 3};

        try {
            int myElement = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

    }
}

    
    

