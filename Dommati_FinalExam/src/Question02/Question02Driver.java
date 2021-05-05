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
public class Question02Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] geoObjects = {new Square(5),new Square(7.9)};

        for (int i = 0; i < geoObjects.length; i++) {
            System.out.println("Area=" + geoObjects[i].getArea());
            if (geoObjects[i] instanceof Colorable) {
                ((Colorable) geoObjects[i]).howToColor();
            }
        }

    }
    
}
