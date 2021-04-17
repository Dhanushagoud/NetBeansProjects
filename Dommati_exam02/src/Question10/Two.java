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
public class Two extends One {
     public Two(){
        super(11);
    }
    public int guess(int x){
        System.out.println("Two guess " + x);
        return super.guess(x)+10; 
    }
    
}	// end class Two

     
   