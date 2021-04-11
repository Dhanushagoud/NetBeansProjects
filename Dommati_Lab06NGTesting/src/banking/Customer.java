/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/17/2021
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code 
 * with anyone under my circumstances.
 */
public class Customer {
    private String dob;
    private String firstName;
    private String lastName ;

    /**
     *
     * @param dob this is dob
     * @param firstName this is firstName
     * @param  lastName this is lastName
     */
    public Customer(String dob, String firstName, String lastName) {
        this.dob = dob;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *gives the Dob
     * @return Dob
     */
    public String getDob() {
        return dob;
    }

    /**
     *gives the firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *gives the LastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *sets the dob
     * @param dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     *sets the firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *sets the lastNmae
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *represents the String
     * @return the firstName,lastName,dob
     */
    @Override
    public String toString() {
        return "\nName:  " + firstName + ", " + lastName + "\nDate of Birth: " + dob;
    }

}

    


