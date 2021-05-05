/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author DhanushaDommati
 */
public class ComparableCircleTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        ComparableCircle comparableCircle1 = new ComparableCircle(10.5);
        ComparableCircle comparableCircle2 = new ComparableCircle(12);

        if (comparableCircle1.compareTo(comparableCircle2) > 0) {
            System.out.println("Circle 1 is the largest one");
        }else{
            System.out.println("Circle 2 is the largest one");
        }


        ComparableCircle comparableCircle3 = new ComparableCircle(7.5);
        ComparableCircle comparableCircle4 = new ComparableCircle(4);


        if (comparableCircle3.compareTo(comparableCircle4) > 0) {
            System.out.println("Circle 3 is the largest one");
        }else{
            System.out.println("Circle 4 is the largest one");
        }

        ComparableCircle comparableCircle5 = new ComparableCircle(200);
        ComparableCircle comparableCircle6 = new ComparableCircle(199);


        if (comparableCircle5.compareTo(comparableCircle6) > 0) {
            System.out.println("Circle 5 is the largest one");
        }else{
            System.out.println("Circle 6 is the largest one");
        }


    }
}

    
    

