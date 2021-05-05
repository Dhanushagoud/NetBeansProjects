/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
   ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee(100,"Dhanusha",1995));
        employeeArrayList.add(new Employee(101,"Praveen",1991));
        employeeArrayList.add(new Employee(102,"Bindhu",1990));
        employeeArrayList.add(new Employee(103,"Jeena",1987));
        employeeArrayList.add(new Employee(104,"Bobby",1996));

        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());
        }

        Collections.sort(employeeArrayList);

        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());
        }
        
        Collections.sort(employeeArrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                return o1.getEmpSalary() - o2.getEmpSalary();
            }
        });

        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());
        }

        Collections.sort(employeeArrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                return o1.getEmpName().compareTo(o2.getEmpName());
            }
        });

        for (Employee employee : employeeArrayList) {
            System.out.println(employee.toString());
        }
    }
}

    
    

