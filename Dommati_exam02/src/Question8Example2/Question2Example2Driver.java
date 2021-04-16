/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Example2;

/**
 *
 * @author DhanushaDommati
 */
public class Question2Example2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Chess c = new Chess();
        
        System.out.println("Normal Method");
        c.play();
       
        System.out.println("Abstract Method");
        c.getPlay();
    }
    
}
