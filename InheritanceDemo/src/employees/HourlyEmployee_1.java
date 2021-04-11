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
class HourlyEmployee_1 extends Employee {
    private String emp;

    public HourlyEmployee_1(String emp, String FristName, String LastName, String SSN) {
        super(FristName, LastName, SSN);
        this.emp = emp;
    }

    @Override
   public String toString() {
        return super.toString()+"   Hourly Employee 1{" +  emp + '}';
    }
    
    
}
