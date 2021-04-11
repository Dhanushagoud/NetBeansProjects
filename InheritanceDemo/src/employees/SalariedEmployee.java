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
public class SalariedEmployee extends HourlyEmployee {

    public SalariedEmployee(int ssn, String fName, String lName, int hours, double salary) {
        super(ssn, fName, lName, hours, salary);
    }

  
    public double calcSalary(){
        System.out.println("Inside SalariedEmployee calcSalary");
        return super.calcSalary();
    }
    public String getFullName(){
        System.out.println("inside SalariedEmployee getFullName");
        return super.getFristName() + " " +super.getFullName();
    }
    public String toString(){
        System.out.println("Inside SalariedEmployee toString");
               return     super.toString() + " "+ super.calcSalary();
    }
    
    
    
}
