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
public class Polygon {
     private String name;
    private int noSides;

    /**
     *two argument constructor
     * @param name
     * @param noSides
     */
    public Polygon(String name, int noSides) {
        this.name = name;
        this.noSides = noSides;
    }

    /**
     *calculates area
     * @return the area
     */
    public double getArea() {
        System.out.println(" in polygon class");
        return 0.0;
    }

    /**
     *gets gives the InternalAngle
     * @return InternalAngle
     */
    public double getInternalAngle() {

        return 0.0;
    }

    /**
     *gets gives the perimeter
     * @return perimeter
     */
    public double getPerimeter() {
        return 0.0;
    }

    /**
     *gets gives the name
     * @return the name
     */
    public String getName() {
        String n=name.substring(0,1);//name.substring(1);
        String s=n.toUpperCase()+name.substring(1);
        
        return s;
    }

    /**
     *gets gives number of sides
     * @return number of sides
     */
    public int getNoSides() {
        return noSides;
    }

    /**
     * represents toString method
     * @return a String
     */
    @Override
    public String toString() {
        
        return "Polygon: " + getName() + "\n	Number of sides: " + noSides;
    }

}

    

