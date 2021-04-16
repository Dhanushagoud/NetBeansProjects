/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author DhanushaDommati
 */
public class Staff extends Employee {
     private String title;

    public Staff(String title, String office, double salary, String datehired, String name, String address, String phoneNumber, String emailaddress) {
        super(office, salary, datehired, name, address, phoneNumber, emailaddress);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class Name: "+this.getClass().getSimpleName() +" Person's name: " +this.getName();
    }
    
    
}


