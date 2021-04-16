/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author DhanushaDommati
 */
public abstract class GeometricObject {
    private boolean filled;
    private String color;

    public GeometricObject(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }
    @Override
    public String toString() {
        return   "color= " + color+ ", "+ "filled= " + filled  ;
    }
    public abstract double getArea();
    
    public abstract double getPerimeter();
}
    

