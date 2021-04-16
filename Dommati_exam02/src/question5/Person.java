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
public class Person {
     private String name;
    private String address;
    private String phoneNumber;
    private String emailaddress;

    public Person(String name, String address, String phoneNumber, String emailaddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Class Name: "+this.getClass().getSimpleName() +" Person's name: " +this.getName();
    }
    
}

    
