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
public class ComparableCircle extends Circle{

    public ComparableCircle(double radius) {

        super(radius);
    }

    public int compareTo(ComparableCircle o) {

        // Comparing radius since it's proportional to the area
        return (int) (this.getRadius() - o.getRadius());
    }
} 
    

