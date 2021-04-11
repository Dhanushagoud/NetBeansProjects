
        



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
public class EmployeeSalary {
   private double hourlyRate;
   private double insuranceRate;
   private double taxRate;
   private double pfRate;
   public static final int HOURS=40;
/**
 * changes values
 * @param hourlyRate this is hourly rate
 * @param insuranceRate this is insurance rate
 * @param taxRate this is tax rate 
 * @param pfRate this is pf rate
 */
    public EmployeeSalary(double hourlyRate, double insuranceRate,
            double taxRate, double pfRate) 
    {
        this.hourlyRate = hourlyRate;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
        this.pfRate = pfRate;
    }
   
  public EmployeeSalary(){
  }
  /**
   * gets gives hourly rate of Employee
   * @return employee's Insurance rate.
   */
    public double getHourlyRate() {
        return hourlyRate;
    }
    /**
     * Gets gives  Insurance rate of the employee
     * @return employee's Insurance rate.
     */
    public double getInsuranceRate() {
        return insuranceRate;
    }
    /**
     * Gets gives  Tax rate of Employee
     * @return employee's Tax rate.
     */
    public double getTaxRate() {
        return taxRate;
    }
    /**
     * Gets gives pf rate of the Employee
     * @return  employee's pf rates.
     */
    public double getPfRate() {
        return pfRate;
    }
    /**
     * Get give the Hours worked by Employee
     * @return employee worked hours.
     */
    public static int getHOURS() {
        return HOURS;
    }
    /**
     * change the hourly rate of employee
     * @param hourlyRate this is the employee's new hourly rate.
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    /**
     * changes the Insurance of employee
     * @param insuranceRate this is the employee's new Insurance rate.
     */
    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }
    /**
     * changes the Tax rate of employee
     * @param taxRate this is the employee's new Tax rate.
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
     /**
      * changes the pf rate of employee
      * @param pfRate this is the employee's new pf rate.
      */
    public void setPfRate(double pfRate) {
        this.pfRate = pfRate;
    }
    /**
     * calculates monthly salary
     * @return monthly salary.
     */
public double calcMonthlysalary()
{
  return HOURS*4*this.hourlyRate;
}
/**
 * calculate monthly Insurance
 * @return monthly Insurance.
 */
  public double calcMontlyInsurance()
{
    return this.calcMonthlysalary()*(this.insuranceRate)/100;
}
/**
 * calculate monthly pf amount
 * @return monthly  pf amount.
 */
public double calcMonthlyPfAmount()
{
    return this.calcMonthlysalary()*(this.pfRate)/100;
}
/**
 * calculate annual gross salary
 * @param bouns
 * @return annual gross salary.
 */
public double calcAnnualGrossSalary(double bouns)
{
    double annualSalary = 12*this.calcMonthlysalary();
    return bouns+annualSalary;
}
/**
 * calculate annual net salary
 * @param bouns
 * @return annual net pay.
 */
public double calcAnnualNetPay(double bouns)
{
  double annualInsurance=12*this.calcMontlyInsurance();
  double annualPfAmount=12*this.calcMonthlyPfAmount();
  double annualGrossSalary=this.calcAnnualGrossSalary(bouns);
 return annualGrossSalary- ((annualGrossSalary*this.taxRate)/100)
         -annualInsurance-annualPfAmount;
}

    @Override
    public String toString() {
        return  "hourlyRate=" + hourlyRate + " insuranceRate=" + insuranceRate 
                + " taxRate=" + taxRate + " pfRate=" + pfRate 
                +"Hours= " + HOURS ;
    }
}


           
  
            
    


  

   



       
  
         

    

