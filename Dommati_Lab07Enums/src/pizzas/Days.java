/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class Days {
    
    private Days() 
    {
        
    }
    
    /**
     *gets gives the OrderDayOfWeek
     * @param orderDate
     * @return
     */
    public static DayOfWeek getOrderDayOfWeek(String orderDate)
    {
       DayOfWeek R;
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
       LocalDate date = LocalDate.parse(orderDate, formatter); 
       R = date.getDayOfWeek();
       return R;
    }
    
    /**
     *gets gives the DiscountDay
     * @param orderDate
     * @return true or false
     */
    public static boolean isDiscountDay(String orderDate)
    {
        boolean res = false;
        if((getOrderDayOfWeek(orderDate).equals(DayOfWeek.SATURDAY)) || 
                (getOrderDayOfWeek(orderDate).equals(DayOfWeek.SUNDAY)))
        {
            res = true;
        }
        return res;
    }
    
}


