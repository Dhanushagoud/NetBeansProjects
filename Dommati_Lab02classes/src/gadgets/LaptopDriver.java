/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgets;

/**
 *
 * @author DhanushaDommati 
 */
public class LaptopDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laptop object1 = new Laptop("hp","intel core i5","windows",512,12.4,true);
        System.out.println("*Testing getter method on object1*");
        System.out.println("Laptop Brandis: "
                +object1.getLaptopBrand());
        System.out.println("Name of the processor is: "
                +object1.getProcessor());
        System.out.println("Operating System name: "
                +object1.getOperatingSystem());
        System.out.println("Hard Drive capacity in GB's: "
                +object1.getHardDrive());
        System.out.println("Screen Size: "+object1.getDisplay());
        System.out.println("is Touch: "+object1.isTouch());
        System.out.println("*Testing toString method on object1*");
        System.out.println(object1);
        System.out.println("*Testing toString method on object2*");
        Laptop object2 = new Laptop();
        System.out.println(object2);
        System.out.println("Testing toString method on object2*");
        object2.setLaptopBrand("Apple");
        object2.setProcessor("Intel core i3");
        object2.setOperatingSystem("macOS Mojava");
        object2.setHardDrive(256);
        object2.setDisplay(10.5);
        object2.setTouch(false);
        System.out.println(object2);
        System.out.println("*Testing getter method on object2*");
        System.out.println("Laptop Brandis: "+object2.getLaptopBrand());
        System.out.println("Name of the processor is: "
                +object2.getProcessor());
        System.out.println("Operating System name: "
                +object1.getOperatingSystem());
        System.out.println("Hard Drive capacity in GB's: "
                +object2.getHardDrive());
        System.out.println("Screen Size: "+object1.getDisplay());
        System.out.println("is Touch: "+object1.isTouch());
        
        
        
        
        
        
           
        
        // TODO code application logic here
    }
    
}
