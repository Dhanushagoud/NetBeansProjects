/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;
/**
 *
 * @author DhanushaDommati 
 */
import java.util.Scanner;

public class EmployeeSalaryDriver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    EmployeeSalary empSalobj1=new EmployeeSalary();
    System.out.println("Testing the EmployeeSalary class:");
    System.out.println("Enter thehourly pay rate of the Employee: $");
    empSalobj1.setHourlyRate(scan.nextDouble());
    System.out.println("Enter the insurance rate of the Employee in percentage:"
            +"in percentage:");
    empSalobj1.setInsuranceRate(scan.nextDouble());
    System.out.println("Enter the tax rate of the Employee in percentage:");
    empSalobj1.setTaxRate(scan.nextDouble());
    System.out.println("Enter the pf rate of the Employee in percentage: ");
        empSalobj1.setPfRate(scan.nextDouble());
    System.out.println("Enter the bonus of the Employee:");
    double bonus=scan.nextDouble();
    System.out.println(empSalobj1);
    System.out.println("The monthly salary of the Employee is: $"
            +empSalobj1.calcMonthlysalary());
    System.out.println("The monthly insurance of the Employee is:$"
            +empSalobj1.calcMontlyInsurance());
        System.out.println("The monthly pf of the Employee is:$"
                +empSalobj1.calcMonthlyPfAmount() );
    System.out.println(("The annual gross salary of the Employee is: $"
            +empSalobj1.calcAnnualGrossSalary(bonus)));
    System.out.println("The gross annual net pay of the Employee is: $"
            +empSalobj1.calcAnnualNetPay(bonus));
    EmployeeSalary  empSalobj2 =new EmployeeSalary();
    System.out.println("**************************************************");
    System.out.println("The details of empSalobj2 are as follow:");
    System.out.println(empSalobj2);
    System.out.println("The montly salary of the Employee is: $"
            +empSalobj2.calcMonthlysalary());
    System.out.println("The monthly insurance of the Employee is: $"
            +empSalobj2.calcMontlyInsurance());
    System.out.println("The monthly pf of the Employee is: $"
            +empSalobj2.calcMonthlyPfAmount());
    System.out.println("The annual gross salary of the Employee is: $"
            +empSalobj2.calcAnnualGrossSalary(bonus));
    System.out.println("The gross annual net pay of the Employee is: $"
            +empSalobj2.calcAnnualGrossSalary(bonus));
    empSalobj2.setHourlyRate(35);
    empSalobj2.setInsuranceRate(12.50);
    empSalobj2.setTaxRate(11.45);
    empSalobj2.setPfRate(10.5);
    System.out.println("Enter the new bonus of the Employee:");
    bonus=scan.nextDouble();
    System.out.println("The details of empSalobj2 object are as follows:");
    System.out.println(empSalobj2);
    System.out.println("The monthly salary of the Employee is: $"
            +empSalobj2.calcMonthlysalary());
    System.out.println("The monthly insurance of the Employee is: $"
            +empSalobj2.calcMontlyInsurance());
    System.out.println("The monthly pf of the Employee is: $" 
            +empSalobj2.calcMonthlyPfAmount());
    System.out.println("The annual gross salary of the Employee is:$" 
            +empSalobj2.calcAnnualGrossSalary(bonus));
    System.out.println("The gross annual net pay of the Employee is:$"
            +empSalobj2.calcAnnualNetPay(bonus));
 
    
    
    
    
    
    
    
    
            
    
    
    }
    
}
