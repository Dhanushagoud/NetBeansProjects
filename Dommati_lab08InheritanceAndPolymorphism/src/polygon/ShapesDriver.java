/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Polygon> polygonList = new ArrayList<>();
        Scanner scan = new Scanner(new File("shapes.txt"));
        while (scan.hasNext()) {
            String name = scan.next();
            double l;
            if (name.equalsIgnoreCase("cube")) {
                l = scan.nextDouble();
               Polygon c = new Cube(l);
                polygonList.add(c);

            } else if (name.equalsIgnoreCase("tetrahedron")) {
                l = scan.nextDouble();
                Polygon tr = new Tetrahedron(l);
                polygonList.add(tr);

            } else if (name.equalsIgnoreCase("triangle")) {
                l = scan.nextDouble();
                Polygon et = new EquilateralTriangle(l);
                polygonList.add(et);

            } else if (name.equalsIgnoreCase("square")) {
                l = scan.nextDouble();
                Polygon sq = new Square(l);
                polygonList.add(sq);

            } else {
                int noOfSides = scan.nextInt();
                l = scan.nextDouble();
                Polygon rp = new RegularPolygon(name, noOfSides, l);
                polygonList.add(rp);

            }

        }
        
        for (Polygon p1  : polygonList) {
            System.out.println("*****************************************");
            System.out.println(p1.toString());
            
        }
        System.out.print("*****************************************");
       
        double max = 0;
        int index = 0;
        for (int i = 0; i < polygonList.size(); i++) {
            if (max < polygonList.get(i).getArea()) {
                max = polygonList.get(i).getArea();
                index = i;
            }
        }
        System.out.println("\nThe polygon with largest area is "
                + polygonList.get(index).getName() + "with area of " + max
                + "cm" + "\u00B2");
        double min = polygonList.get(0).getArea();
        int index1 = 0;

        for (int i = 0; i < polygonList.size(); i++) {
            if (polygonList.get(i).getArea() < min) {
                min = polygonList.get(i).getArea();
                index1 = i;
            }
        }
        System.out.println("The polygon with smallest area is "
                + polygonList.get(index1).getName() + " with area of " + min
                + "cm" + "\u00B2");
        max = 0;
        index = 0;
        for (int i = 0; i < polygonList.size(); i++) {
            if (max < polygonList.get(i).getPerimeter()) {
                max = polygonList.get(i).getPerimeter();
                index = i;
            }
        }
        System.out.println("The polygon with largest perimeter  is "
                + polygonList.get(index).getName() + " with perimeter of " + max
                + "cms");

        min = polygonList.get(0).getPerimeter();
        index1 = 0;
        for (int i = 0; i < polygonList.size(); i++) {
            if (polygonList.get(i).getPerimeter() < min) {
                min = polygonList.get(i).getPerimeter();
                index1 = i;
            }
        }
        System.out.println("The polygon with smallest perimeter is "
                + polygonList.get(index1).getName() + " with perimeter of " + min
                + "cms");
        System.out.println("*****************************************");
        System.out.println("Surface area to Volume ratio of given solids are:");
        for (Polygon p : polygonList) {
            if (p.getClass().getSimpleName().equals("Cube")) {
                Cube c = new Cube(p.getPerimeter() / p.getNoSides());
                System.out.println(p.getName());

                System.out.println("        Surface area: " + p.getArea()+ "cm" + "\u00B2"
                        + "\n        Volume: " + c.getVolume()+"cm"+"\u00b3");
            }
            if (p.getClass().getSimpleName().equals("Tetrahedron")) {
                Tetrahedron t = new Tetrahedron(p.getPerimeter() / p.getNoSides());
                System.out.println(p.getName());

                System.out.println("        Surface area: " + p.getArea()+ "cm" + "\u00B2"
                        + "\n        Volume: " + t.getVolume()+"cm"+"\u00b3");

            }
        }
        System.out.println("******************************************");
        System.out.println("Polymorphic substitution refers to the substitution "
                + "of a Sub-class object for a reference to the Super-class.\n "
                + "In this lab, we used polymorphic substitution in the "
                + "ShapeDrvier while loop. Using if conditions,\n"
                + " we created objects for each type of polygon "
                + "(Square, Tetrahedron, etc.) based on the class type.");
        System.out.println("******************************************");
        System.out.println("ShapesDriver employs late binding. In the for loops\n,"
                + " java calls the toString, getArea, and getVolume methods.");
        System.out.println("******************************************");
        

    }

}

    
    

