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
public class defaultdriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyClass class01 = new MyClass();
        System.out.println(class01.foo(3));
        System.out.println(class01.goo("Goodbye"));
        /*output for above
        Inside MyClass-foo
        6
        Inside Inerface1
        7*/

    }

}

    
    

