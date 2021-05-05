/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

/**
 *
 * @author DhanushaDommati
 */
public class Employee implements Comparable<Employee>  {

    private int empId;
    private String empName;
    private int empSalary;

    public Employee(int empId, String empName, int empSalary) {

        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {

        return empId;
    }

    public void setEmpId(int empId) {

        this.empId = empId;
    }

    public String getEmpName() {

        return empName;
    }

    public void setEmpName(String empName) {

        this.empName = empName;
    }

    public int getEmpSalary() {

        return empSalary;
    }

    public void setEmpSalary(int empSalary) {

        this.empSalary = empSalary;
    }

    @Override
    public String toString() {

        return empId + " " + empName + " " + empSalary;
    }

    @Override
    public int compareTo(Employee o) {

        return empId - o.getEmpId();
    }
}
