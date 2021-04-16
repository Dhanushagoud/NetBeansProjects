/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;
import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class Question6Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scan = new Scanner(System.in);
        System.out.println("Enter sides of a traingle: ");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        double s3 = scan.nextDouble();
        System.out.print("Enter a color: ");
        String color = scan.next();
        System.out.print("Is the triangle filled(true / false)? ");
        boolean filled = scan.nextBoolean();
        Triangle values = new Triangle(s1, s2, s3, filled, color);
        System.out.println(values);
	
    }
    
}
    
    

