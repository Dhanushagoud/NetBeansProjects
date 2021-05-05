/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

/**
 *
 * @author DhanushaDommati
 */
public class Square extends GeometricObject implements Colorable {

    /**
     * Initialization of the variable named side of type double
     */
    public double side;

    /**
     * This is a default constructor
     */
    
    public int Square() 
    {
        return 0;
    }

    /**
     * This is a parameterized constructor 
     * @param side Side of Square
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * @return side of the square
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side Side of the square
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * @return Area of the square
     */
    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }

    /**
     * Prints the statement "Color all four sides."
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}

    

