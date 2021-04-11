/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucks;

/**
 *
 * @author DhanushaDommati
 */
public class Starbucks {
    private String customerName	;
   private String address;
   private String contactNumber;
   private String customerType;
   private String billReciept;
   private double billAmount;
   private String order;
   int orderNumber=1;

    /**
     *
     * @param customerName this is CustomerName
     * @param address      this is address
     * @param contactNumber this is contactNumber
     * @param customerType this is customerType
     */
    public Starbucks(String customerName, String address, String contactNumber,
            String customerType) {
        this.customerName = customerName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.customerType = customerType;
        billReciept = "";
        billAmount = 0;
        order = "";
    }

    /**
     *gets gives CustomerName
     * @return CustmoerName
     */
    public String getCustomerName() {
        return customerName;
        
    }

    /**
     *sets the customerName
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *get gives Address
     * @return Address
     */
    public String getAddress() {
        return address;
    }

    /**
     *sets the Address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *get gives ContactNumber
     * @return ContactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     *sets the contactNumber
     * @param contactNumber
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     *get gives CustomerType
     * @return CustomerType
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     *sets the customerType
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     *get gives BillReciept
     * @return billReciept
     */
    public String getBillReciept() {
        return billReciept;
    }

    /**
     *sets the billReciept
     * @param billReciept
     */
    public void setBillReciept(String billReciept) {
        this.billReciept = billReciept;
    }

    /**
     *get gives BillAmount
     * @return BillAmount
     */
    public double getBillAmount() {
        return billAmount;
    }

    /**
     *sets the billAmount
     * @param billAmount
     */
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    /**
     *get gives Order
     * @return order
     */
    public String getOrder() {
        return order;
    }

    /**
     *sets the order
     * @param order
     */
    public void setOrder(String order) {
        this.order = order;
    }
    
    /**
     *get gives NameInitials
     * @return NameInitials
     */
    public String getNameInitials()
    {
     String initial ="";
       initial=initial+customerName.charAt(0)+".";
        
        for(int i=1;i<customerName.length();i++)
        {
            char temp = customerName.charAt(i);
          if(temp == ' ')  
          {
              
              initial=initial + customerName.charAt(i+1)+".";
          }
        }
        return initial.toUpperCase();
    }   

private String getItemName(int itemNumber)
{
if(itemNumber==1)
    return "Ham & Swiss Panini";
else if(itemNumber==2)
    return "Cheese & Fruit Bistro Box";
else if(itemNumber==3)
    return "Turkey Pesto Panini";
else if(itemNumber==4)
    return "Salted Caramel or Birthday Cake Pop";
else if(itemNumber==5)
    return "Roasted Tomato & Mozzarella Panini";
else
return "wrong itemNumber"; 
        }
private double getItemCost(String itemName){
    if(itemName=="Ham & Swiss Panini")
        return 5.25;
                if (itemName=="Cheese & Fruit Bistro Box")
                    return 4.95;
                else if(itemName=="Turkey Pesto Panini")
                    return 5.96;
                else if (itemName=="Salted Caramel or Birthday Cake Pop")
                    return 3.50;
                else
                    return 3.46;
}

    /**
     *it updates the Receipt
     * @param quantity
     * @param itemNumber
     */
    public void updateReceipt(int quantity, int itemNumber)
         {
        billAmount+= quantity * getItemCost(getItemName(itemNumber));
        
        billReciept+= getItemName(itemNumber)+""
                + "("+ getItemCost(getItemName(itemNumber))+")"+"            *"
                +quantity+" = "+Math.round((getItemCost(getItemName(itemNumber)))
                        *quantity *100)/100.0 +"\n";
        //System.out.println(getItemName(itemNumber)+(getItemCost(getItemName(itemNumber))) +"*"+quantity+"="+(getItemCost(getItemName(itemNumber)))*quantity);
    }
private double getDiscount()
{
    if(customerType.equals("Regular"))
        {
            if(billAmount > 10)
            {
                return Math.round(billAmount*0.1 *100)/100.0;
            }
        }else
        {
            return 0.0;
        }
        return 0.0;
    }
private double getSalesTax()
{
     return Math.round(billAmount*8/100 *100)/100.0;
    }

    /**
     *get gives FinalBillAmount
     * @return FinalBillAmount
     */
    public double getFinalBillAmount()
{
        double finalBill=(billAmount + getSalesTax() - getDiscount());
        return Math.round(finalBill*100)/100.0;
    }
private String getFinalBillReciept()
{
    return "\nThe Following is the bill for purchased products\n"+billReciept
            + "                                    Sales Tax = "
            + getSalesTax()
            + "\n                                     discount = -"
            + getDiscount()
            + "\n-------------------------------------------------------\n"
            + "                                   Total Bill = "
            + getFinalBillAmount()
            + "\n-------------------------------------------------------\n";
    }
 private String getOrderWithName()
{
   return "\nOrder - 1 by"+this.getNameInitials();
}
private String getContactDetails()
{
    return "\nAddress: "+ address + "\n" + "Contact: "+ contactNumber;
    }
private String getBalance(double cash)
{
        double rem=cash;
        rem=rem-getFinalBillAmount();
        String balSheet="";
        System.out.println("Change received is as follow ");
        
        if(rem>=50)
        {  
            System.out.println("$50.00  * "+(int)Math.floor(rem/50)+ " = "+
                    (50.00 * Math.floor(rem/50)));
        rem=rem%50;
        }
        if(rem>=10&&rem<50)
        {
            
            System.out.println("$10.00  * "+(int)(Math.floor(rem/10))+ " = "+
                    (10.00 *Math.floor( rem/10)) );
            rem=rem%10;
        }
        if(rem>=5&&rem<10)
        {
            
            System.out.println("$5.00   * "+(int)Math.floor(rem/5)+ " = "+
                    (5.00 * Math.floor(rem/5) ));
            rem=rem%5;
        }
        
        if(rem>=1&&rem<5)
        {
        System.out.println("$1.00   * "+(int)Math.floor(rem/1)+ " = "+ 
                (1.00 * Math.floor(rem/1) ));
            rem=rem%1;
        }
        if(rem>=0.25&&rem<1)
        {
            
            System.out.println("$0.25   * "+(int)Math.floor(rem/0.25)+ " = "+
                    (0.25 * Math.floor(rem/0.25)));
            rem=rem%0.25;
        }
        if(rem>=0.10&&rem<0.25)
        {
            
            System.out.println("$0.10   * "+(int)Math.floor(rem/0.10)+ " = "+
                    (0.10 *Math.floor (rem/0.10)));
            rem=rem%0.10;
        }
        if(rem>=0.05&&rem<0.10)
        {
            
            System.out.println("$0.05   * "+(int)Math.floor(rem/0.05)+ " = "+
                    (0.05 * Math.floor(rem/0.05)));
            rem=rem%0.05;
        }
        if(rem>=0.01&&rem<0.05)
        {
            
            System.out.println("$0.01   * "+(int)Math.floor(rem/0.01)+ " = "+
                    (0.01 * Math.floor(rem/0.01)));
            rem=rem%0.01;
        }
        System.out.println("--------------------");
        System.out.println("Total Bal = "+(int)Math.round
        ((cash - getFinalBillAmount())*100)/100.0);
        return "";
}

    /**
     *represents the String
     * @return String
     */
    @Override
        public String toString()
         {
        String output= this.getOrderWithName()+
              this.getNameInitials()+
              this.getContactDetails()+
              this.getFinalBillReciept();
       orderNumber++;
      return output;
         }

    /**
     *it prints toString and getBalance
     * @param cash
     */
    public void printReceipt(double cash)
  {
      System.out.println(this.toString());
        System.out.println(getBalance(cash));
    }
        
}



     


    

















