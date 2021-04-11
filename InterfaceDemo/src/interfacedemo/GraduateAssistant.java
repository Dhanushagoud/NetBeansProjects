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
public abstract class GraduateAssistant implements Payable{
    private String fName;
    private String lName;

    public GraduateAssistant(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    @Override
    public String toString() {
        return "GraduateAssistant{" + "fName=" + fName + ", lName=" + lName + '}';
    }
    
    @Override
    public double caltaxrate() {
        return calcsal()*TAX_RATE/100.0;
    }
    @Override
    public double calSalAfterTaxes() {
    return calcsal()-caltaxrate();
    }
    public abstract String getInitials();
}
