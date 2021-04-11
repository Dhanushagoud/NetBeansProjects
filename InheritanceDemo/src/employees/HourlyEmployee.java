/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author DhanushaDommati
 */
public class HourlyEmployee extends Employee {
 private double salary;
    private int hrsWorked;

 

    public HourlyEmployee( int ssn, String fName, String lName, int hours, double salary) {
        super(ssn, fName, lName);
        this.hrsWorked = hours;
        this.salary = salary;
        System.out.println("Inside Hourly Employee constructor");
    }

    @Override
    public String getFullName(){
        System.out.println("Inside HourlyEmployee getFullName");
        return super.getLastName()+" "+super.getFristName();
    }
    public double calcSalary(){
        System.out.println("Inside HourlyEmployee calcSalary");
        return hrsWorked*salary;
    }
    
    @Override
    public String toString(){
        System.out.println("Inside HourlyEmployee tostring");
        return super.toString()+" "+calcSalary();
    }
}
    