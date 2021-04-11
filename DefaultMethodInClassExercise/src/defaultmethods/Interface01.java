/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethods;

/**
 *
 * @author Dhanusha Dommati
 */
public interface Interface01 {
    public abstract int foo (int myint);
    default int goo (String myString){
        System.out.println("Inside Inerface1");
        return myString.length();
    }
    
}
