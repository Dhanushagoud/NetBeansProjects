/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pizzas.Sides.Cheese;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class OrdersDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("input.txt"));
        System.out.println("*****************************************************");
        System.out.println("*********************** Pizza Hut ******************");
        System.out.println("*****************************************************");
        while (sc.hasNext()) 
        {
            OrdersSummary summaryorder = new OrdersSummary();
            String date = sc.nextLine();
            Days.getOrderDayOfWeek(date);
            String pName = sc.nextLine();
            
            PizzaTypes enumName = PizzaTypes.valueOf(pName.toUpperCase().replaceAll(" ", "_"));
            String pizzaSize = sc.next();
            int a = sc.nextInt();
            sc.nextLine();
            String sauce = sc.nextLine();
            Sauces sauceEnum = Sauces.valueOf(sauce.toUpperCase().replaceAll(" ", "_"));
            String sides="";
            do
            {
             sides = sides+sc.next()+" ";
            }while(!(sc.hasNext("-")));
                
            sc.next();
            sc.skip("\\s*");
            Sides numSides = Sides.valueOf(sides.trim().toUpperCase().replaceAll(" ", "_"));
            String sideSize = sc.nextLine();
            String cheese = sc.nextLine();
            Cheese enumCheese = Cheese.valueOf(cheese.toUpperCase().replaceAll(" ", "_"));
            String dr = sc.nextLine();
            Drinks drinksEnum = Drinks.valueOf(dr.toUpperCase().replaceAll(" ", "_"));
            String d = sc.nextLine();
            Desserts dessertEnum = Desserts.valueOf(d.trim().toUpperCase().replaceAll(" ", "_"));
            Order or = new Order(enumName, pizzaSize, a, sauceEnum, numSides, sideSize, drinksEnum, enumCheese, dessertEnum);
            summaryorder.addAOrder(or);
            System.out.println(summaryorder.printReceipt(date));
            
        }
        sc.close();
 
    }
    
}
          