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
public class MultipleExceptions {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        public static void myMethod(int number) throws IOException, ArithmeticException, InterruptedException {
        if (number < 10) {
            throw new InterruptedException("InterruptedException Occurred");
        } else {
            throw new ArithmeticException("ArithmeticException");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        try {
            
            myMethod(number);
        } catch (Exception excepname) {
            System.out.println("The type of Exception we got "+ excepname);
        }
    }

}
    
    

