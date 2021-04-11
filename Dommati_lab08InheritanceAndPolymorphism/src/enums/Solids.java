/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public enum Solids {
    /**
     *enum TETRAHEDRON
     */
    TETRAHEDRON(4),

    /**
     *enum  CUBE
     */
    CUBE(6),

    /**
     *enum BOX
     */
    BOX(6);
    private final int noFaces;

    private Solids(int noFaces) {
        this.noFaces = noFaces;
    }

    /**
     *gets gives the number of faces
     * @return the integer
     */
    public int getNoFaces() {
        return noFaces;
    }

}




