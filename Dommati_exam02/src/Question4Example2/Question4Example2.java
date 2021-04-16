/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4Example2;

/**
 *
 * @author DhanushaDommati
 */
public class Question4Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b=new Bicycle(2);
         System.out.println(b.toString());
        MountainBike m =new MountainBike(25,15);
        System.out.println(m.toString());
        System.out.println("Inheritance "+m.getGear());
        //polymorphic substitution
        Bicycle b1 =new MountainBike(3,15);
        //late Binding polymorphism
         System.out.println(b.toString());
        System.out.println(b1.toString());
       
    }
    }
    

