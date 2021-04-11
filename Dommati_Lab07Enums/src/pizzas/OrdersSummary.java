/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;
import java.util.ArrayList;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class OrdersSummary {
    
    private ArrayList<Order> orders;
    
    /**
     *constructor of OrdersSummary
     */
    public OrdersSummary() 
    {
        this.orders = new ArrayList<Order>();
    }
    
    /**
     *constructor of getOrders
     * @return orders
     */
    public ArrayList<Order> getOrders() 
    {
        return orders;
    }
    
    /**
     *adds an order
     * @param order
     */
    public void addAOrder(Order order)
    {
        orders.add(order);
    }
    
    /**
     *calculates the TotalCostOfAllOrders
     * @param orderDate
     * @return
     */
    public double calcTotalCostOfAllOrders(String orderDate)
    {
        double D = 0.0;
        for(int i=0;i<orders.size();i++)
        {
            D = getOrders().get(i).getTotalCost(orderDate);
        }
        return D;
    }
    
    /**
     *calculates TotalBillWithTax
     * @param orderDate
     * @return
     */
    public double calcTotalBillWithTax(String orderDate)
    {
        double D = 0.0;
        for(int i=0;i<orders.size();i++)
        {
            double d;
            d = (getOrders().get(i).getTotalCost(orderDate)
                    - getOrders().get(i).calcDiscount(orderDate))*0.086;
            D = (getOrders().get(i).getTotalCost(orderDate)
                    - getOrders().get(i).calcDiscount(orderDate))+d;
        }
        return D;
    }
    
    /**
     *prints the Receipt
     * @param orderDate
     * @return
     */
    public String printReceipt(String orderDate)
    {
        String S="";
        for(int i=0;i<orders.size();i++)
        {
            //getOrders().get(i).calcDiscount(orderDate)
            double cost = getOrders().get(i).getTotalCost(orderDate)
                    - getOrders().get(i).calcDiscount(orderDate);
            double tax = cost * 0.086;
            S = "**************  "+ orderDate +", "+Days.getOrderDayOfWeek
        (orderDate)+"  ***************\n" + getOrders().
                get(i).toString(orderDate) +
                    "\n-----------------------------------------------------\n"
                    + "		Order Total :		$"
                    +(Math.round((calcTotalCostOfAllOrders(orderDate))*100))/100.0
                    +"\n		Discount@50 :		$"+
                    (String.format("%.2f", (Math.round((getOrders().get(i).
                            calcDiscount(orderDate)) * 100))/100.0)) +"\n		"
                    + "Tax@8.6 :		$"+(String.format("%.2f", 
                            (Math.round(tax * 100))/100.0))+"\n		"
                    + "Total Amount with tax : $"+(String.format("%.2f", 
                            (Math.round((calcTotalBillWithTax(orderDate))*100))/100.0))
                    +"\n-----------------------------------------------------";
        }
        return S;
    }

   
    }

   
    

