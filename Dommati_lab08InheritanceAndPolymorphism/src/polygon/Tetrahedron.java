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
public class Tetrahedron extends EquilateralTriangle{

    /**
     *one argument constructor
     * @param length
     */
    public Tetrahedron(double length) {
        super("Tetrahedron",length);
    }

    /**
     *calculates height of Tetrahedron
     * @return the height
     */
    public double getHeight(){
    return Math.round((((Math.sqrt(6.0))/3.0)*super.getLength())*100.0)/100.0;
    
    }

    /**
     *calculates  area of Tetrahedron
     * @return the area
     */
    public double getArea(){
    return super.getArea()*(Solids.TETRAHEDRON.getNoFaces());
    }

    /**
     *calculates volume of Tetrahedron
     * @return the volume
     */
    public double getVolume(){
    
    return Math.round(((Math.sqrt(2)/12.0)*(Math.pow(super.getLength(), 3)))*100.0)/100.0;
    }

    /**
     *calculates InSphereRadius of Tetrahedron
     * @return the InSphereRadius
     */
    public double getInSphereRadius(){
    return Math.round((super.getLength()/(Math.sqrt(24)))*100.0)/100.0;
    }

    /**
     *calculates CircumSphereRadius of Tetrahedron
     * @return the CircumSphereRadius
     */
    public double getCircumSphereRadius(){
        return Math.round(((Math.sqrt(6)/4)*super.getLength())*100.0)/100.0;
    
    }

    /**
     *represents the toString method of EquilateralTriangle
     * @return the String
     */
    @Override
    public String toString() {
        return super.toString()+
                "\n        Insphere radius: "+getInSphereRadius()+"cms"+
                "\n        Circumsphere radius: "+getCircumSphereRadius()+"cms"+
                "\n        Volume: "+getVolume()+"cm"+"\u00b3";
    }

   
    
    
}

    

