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
public class Employee {

    private String fristName;
    private String lastName;
    private int SSN;

    public Employee(int SSN, String FristName, String LastName) {
        this.SSN = SSN;
        this.fristName = FristName;
        this.lastName = LastName;
        System.out.println("Inside Employee constructor");
    }

    public String getFristName() {
        System.out.println("Inside Employee getFirstName");
        return fristName;
    }

    public String getLastName() {
        System.out.println("Inside Employee getLastName");
        return lastName;
    }

    public String getlastName() {
        System.out.println("Inside Employee getLastName");
        return fristName + " " + lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setFristName(String FristName) {
        this.fristName = FristName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    //public void setSSN(String SSN) {
    //     this.SSN = SSN;
    //}
    public String getFullName() {
        return lastName + ", " + fristName;

    }

    @Override
    public String toString() {
        return SSN + " " + getFullName();
    }

}
