/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author DhanushaDommati
 */
public class Question4driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehicle v=new Vehicle("Mahendra");
         System.out.println(v.toString());
        Car c=new Car("SUV","KIA");
        System.out.println(c.toString());
        System.out.println("Inheritance "+c.getBrand());
        //polymorphic substitution
        Vehicle v1=new Car("Scorpio","Mahendra");
        //late Binding polymorphism
         System.out.println(v.toString());
        System.out.println(v1.toString());
       
    }
    
}
