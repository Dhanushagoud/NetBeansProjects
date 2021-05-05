/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author DhanushaDommati
 */
public class RecursivemethodDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        recursiveFunction(10);
    }
    
    
    public static void recursiveFunction(int i) {

        System.out.println(i);
        if (i > 0) {
            recursiveFunction(i +1);
        }
    }
}

