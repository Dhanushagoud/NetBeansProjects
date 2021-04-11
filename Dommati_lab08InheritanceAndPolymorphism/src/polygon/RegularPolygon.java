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
public class RegularPolygon extends Polygon {

    private double length;

    /**
     * Three argument constructor
     *
     * @param name
     * @param noSides
     * @param length
     */
    public RegularPolygon(String name, int noSides, double length) {
        super(name, noSides);
        this.length = length;
    }

    
    /**
     * gets  gives the length of RegularPolygon
     *
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * calculates  area of RegularPolygon
     *
     * @return the area
     */
    public double getArea() {

        double output = 0;
        int n = super.getNoSides();

        output = (1.0 / 4.0) * (n * length * length * (1 / Math.tan(Math.PI / n)));
        return Math.round(output * 100.0) / 100.0;
    }

    /**
     * gets gives the perimeter of RegularPolygon
     *
     * @return the perimeter
     */
    public double getPerimeter() {
        return Math.round((super.getNoSides() * length) * 100.0) / 100.0;
    }

    /**
     * calculates  InternalAngle
     *
     * @return the InternalAngle
     */
    public double getInternalAngle() {

       return Math.round((180 / super.getNoSides()) * (super.getNoSides() - 2) * 100.0) / 100.0;
    }

    /**
     * calculates InCircleRadius
     *
     * @return the InCircleRadius
     */
    public double getInCircleRadius() {

        return Math.round(((length / 2) * (1 / (Math.tan(Math.PI/ super.getNoSides())))) * 100.0) / 100.0;
    }

    /**
     * calculates CircumCircleRadius
     *
     * @return the CircumCircleRadius
     */
    public double getCircumCircleRadius() {
        return Math.round((length / 2) * (1 / (Math.sin(Math.PI / super.getNoSides()))) * 100.0) / 100.0;

    }

    /**
     * represents the toString of Polygon
     *
     * @return the String
     */
    public String toString() {
        return super.toString()
                + "\n	Length of side: " + length + "cms"
                + "\n	Internal angle: " + (Math.round(this.getInternalAngle() * 100) / 100.0) + "\u00b0"
                + "\n	Circumcircle radius: " + (Math.round(this.getCircumCircleRadius() * 100) / 100.0) + "cms"
                + "\n	Incircle radius: " +(Math.round(this.getInCircleRadius() * 100) / 100.0) + "cms"
                + "\n	Area: " + (Math.round(this.getArea() * 100) / 100.0) + "cm\u00b2"
                + "\n	Perimeter: " +(Math.round(this.getPerimeter() * 100) / 100.0) + "cms";
    }
}


    