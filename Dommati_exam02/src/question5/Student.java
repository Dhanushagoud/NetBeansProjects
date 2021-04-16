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
public class Student extends Person {
     private String grade;
    private String status;

    public Student(String grade, String status, String name, String address, String phoneNumber, String emailaddress) {
        super(name, address, phoneNumber, emailaddress);
        this.grade = grade;
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "Class Name: "+this.getClass().getSimpleName() +" Person's name: " +this.getName();
    }
    
    
}

    

