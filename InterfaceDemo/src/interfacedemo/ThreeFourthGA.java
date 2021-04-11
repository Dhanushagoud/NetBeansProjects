/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author Dhanusha Dommati
 */
public class ThreeFourthGA extends GraduateAssistant {

    public ThreeFourthGA(String fName, String lName) {
        super(fName, lName);
    }
    
    @Override
    public String getInitials() {
        return super.getfName().charAt(0)+". "+
                super.getlName().charAt(0)+".";
        }

    @Override
    public double calcsal() {
    return FULL_SAL*3/4;   
    }

    /*@Override
    public double caltaxrate() {
    return calcsal()*TAX_RATE;    
    }*/

    @Override
    public double calSalAfterTaxes() {
    return calcsal()*caltaxrate();
    }
    
}
