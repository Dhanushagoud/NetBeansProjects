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
public class Employee extends Person {
     private String office;
    private double salary;
    private String datehired;

    public Employee(String office, double salary, String datehired, String name, String address, String phoneNumber, String emailaddress) {
        super(name, address, phoneNumber, emailaddress);
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }

    
    @Override
    public String toString() {
         return "Class Name: "+this.getClass().getSimpleName() +" Person's name: " +this.getName();
     }
    
    
}


