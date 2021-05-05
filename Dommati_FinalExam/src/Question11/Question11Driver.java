/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import Question11.Question11.MyClass;

/**
 *
 * @author DhanushaDommati
 */
public class Question11Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass object1 = new MyClass(1);
        MyClass object2 = new MyClass(2);
        MyClass object3 = new MyClass(2);

        System.out.println(object1.equals(object2));
        System.out.println(object2.equals(object3));
    }
}
    
    

