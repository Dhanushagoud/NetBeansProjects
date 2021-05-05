/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class Question07Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt();
        }

        System.out.print("Enter an index of the array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        try {
            int element = array[n];
            System.out.println("Element: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

    }
}

    
    

