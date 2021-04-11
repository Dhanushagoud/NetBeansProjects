/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import enums.Solids;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class Cube extends Square {

    /**
     *One argument Constructor
     * @param length
     */
    public Cube(double length) {
        super("Cube",length);
        
    }

    /**
     *overrides Square getArea and calculates the area of the cube 
     * @return the area of cube
     */
    public double getArea(){
        return Math.round((super.getArea()*Solids.CUBE.getNoFaces())*100.0)/100.0;
    
    }

    /**
     *calculates  volume of cube
     * @return the volume of cube
     */
    public double getVolume(){
     return Math.round((Math.pow(super.getLength(),3.0))*100.0)/100.0;
    }

    /**
     *calculates  InSphereRadius
     * @return the InSphereRadius
     */
    public double getInSphereRadius(){
        return Math.round((super.getLength()/2)*100.0)/100.0;
    }

    /**
     *calculates CircumSphereRadius
     * @return CircumSphereRadius
     */
    public double getCircumSphereRadius(){
    return Math.round((((Math.sqrt(3.0))/2.0)*super.getLength())*100.0)/100.0;
    }

    /**
     *represents the Square toString method
     * @return
     */
    public String toString(){
    return super.toString()+
            "\n        Insphere radius: "+getInSphereRadius()+"cms"+
            "\n        Circumsphere radius: "+getCircumSphereRadius()+"cms"+
            "\n        Volume: "+getVolume()+"cm"+"\u00B3";
    
    }
    
}
