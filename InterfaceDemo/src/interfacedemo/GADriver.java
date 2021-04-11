/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

import java.util.ArrayList;

/**
 *
 * @author Dhanusha Dommati
 */
public class GADriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     GraduateAssistant hga=new HalfGa("Dhanusha", "Dommati");
        System.out.println(hga);
        System.out.println(hga.getInitials());
        System.out.println(hga.calcsal());
        GraduateAssistant tga=new ThreeFourthGA("John", "Smith");
        System.out.println(tga);
        System.out.println(tga.getInitials());
        System.out.println(tga.calcsal());
        System.out.println(tga.calSalAfterTaxes());
        GraduateAssistant hga1=new HalfGa("Praveen", "Dommati");
        GraduateAssistant hga2=new HalfGa("X", "Y");
        ArrayList<GraduateAssistant> galist=new ArrayList<>();
        galist.add(hga);
        galist.add(hga1);
        galist.add(tga);
        galist.add(hga2);
        for(GraduateAssistant ga:galist){
            Boolean b=ga instanceof ThreeFourthGA;
            if(b){
                System.out.println(ga);
            }
        
        }
        
    }
    
}
