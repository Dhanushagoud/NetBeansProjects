/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class MultipleExceptionsDriverExample02 {

    /**
     * @param args the command line arguments
     */
    public static void myMethod(int d) throws NoSuchFieldException, ArithmeticException, InterruptedException {
        if (d > 20) {
            throw new ArithmeticException("ArithmeticException Occurred");
        } 
        else if(d<50){
            throw new NoSuchFieldException("NoSuchFieldException");
        }
        else {
                throw new InterruptedException("InterruptedEXception");
                }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=scan.nextInt();
        try {
            
            myMethod(number);
        } catch (Exception exceptionname) {
            System.out.println("The type of Exception we got "+ exceptionname);
        }
    }

}
    
    
