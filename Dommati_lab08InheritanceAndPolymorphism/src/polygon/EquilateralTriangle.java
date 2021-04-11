/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class EquilateralTriangle extends RegularPolygon {

    /**
     *one argument constructor
     * @param length
     */
    public EquilateralTriangle(double length) {
        super("Equilateral Triangle", 3, length);
    }

    /**
     *two argument constructor
     * @param name
     * @param length
     */
    public EquilateralTriangle(String name,  double length) {
        super(name, 3, length);
    }
    
    /**
     *calculates height of EquilateralTriangle
     * @return the height
     */
    public double getHeight(){
    
    return Math.round((((Math.sqrt(3.0))/2.0)*super.getLength())*100.0)/100.0;
    }

    /**
     *represents the toString method of  
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+
                "\n        Height: "+this.getHeight()+"cms";
    }

      
}

