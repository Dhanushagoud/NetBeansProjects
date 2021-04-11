/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.YEARS;


/**
 *
 * @author DhanushaDommati
 */
public class ConnectionAccount {
     private String customerName;
    private String phoneNumber;
    private String connectionType;
    private String joiningDate;

    /**
     * Constructor with three arguments
     * @param customerName Name of the customer
     * @param phoneNumber Phone number of the customer
     * @param connectionType connection type
     */
    public ConnectionAccount(String customerName, String phoneNumber, String connectionType)
    {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.connectionType = connectionType;
    }

    /**
     * Constructor with four arguments
     * @param customerName Name of the customer
     * @param phoneNumber Phone number of the customer
     * @param connectionType connection type
     * @param joiningDate Date of joining
     */
    public ConnectionAccount(String customerName, String phoneNumber, String connectionType, String joiningDate) 
    {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.connectionType = connectionType;
        this.joiningDate = joiningDate;
    }

    /**
     * Get gives the Name of the customer
     * @return Name of the customer
     */
    public String getCustomerName() 
    {
        return customerName;
    }

    /**
     * Get gives the phone number of the customer
     * @return phone number of the customer
     */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    /**
     * Get gives the connection type
     * @return connection type
     */
    public String getConnectionType() 
    {
        return connectionType;
    }

    /**
     * Get gives the date of joining
     * @return the date of joining
     */
    public String getJoiningDate() 
    {
        return joiningDate;
    }
    
    /**
     * Get gives the number of years
     * @return the number of years
     */
    public int numberOfYears()
    {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
       //LocalDate date = LocalDate.parse(orderDate, formatter); 
       LocalDate startDate = LocalDate.parse(joiningDate, formatter);
       LocalDate afterDate = LocalDate.now();
       int range = (int)YEARS.between(startDate, afterDate);
       //return YEARS.between(joiningDate, afterDate);
       return range;
    }
}

    

