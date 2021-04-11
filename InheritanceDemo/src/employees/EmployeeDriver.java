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
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee(1234,"Ajay", "Bandi");
        System.out.println(emp);
        System.out.println("-------------------------");
        HourlyEmployee hrEmp=new HourlyEmployee(1234,"Joe","Williams", 12, 10.0);
        System.out.println(hrEmp);
        System.out.println("--------------------------");
        SalariedEmployee salEmp=new SalariedEmployee(4357,"Bob", "Williams",20,10.0);
        System.out.println(salEmp);
        System.out.println("---------------------------");
    
    
        HourlyEmployee hrEmp1=new SalariedEmployee(5678,"Kaite", "Lorsen", 3, 23);
        System.out.println(hrEmp1);
    } 
    }
    

