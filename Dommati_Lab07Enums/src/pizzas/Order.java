/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;
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
public class Order {
    
    private PizzaTypes pizzasName;
    private String pizzasSize;
    private int quantity;
    private Sauces sauce;
    private Sides side;
    private String sideSize;
    private Drinks drink;
    private Cheese cheese;
    private Desserts dessert;
    private Double cost;
    
    /**
     *
     * @param pizzasName
     * @param pizzasSize
     * @param quantity
     * @param sauce
     * @param side
     * @param sideSize
     * @param drink
     * @param cheese
     * @param dessert
     */
    public Order(PizzaTypes pizzasName, String pizzasSize, int quantity, 
            Sauces sauce, Sides side, String sideSize, 
            Drinks drink, Cheese cheese, Desserts dessert) 
    {
        this.pizzasName = pizzasName;
        this.pizzasSize = pizzasSize;
        this.quantity = quantity;
        this.sauce = sauce;
        this.side = side;
        this.sideSize = sideSize;
        this.drink = drink;
        this.cheese = cheese;
        this.dessert = dessert;
    }

    /**
     *get gives the PizzasName
     * @return PizzasName
     */
    public PizzaTypes getPizzasName() {
        return pizzasName;
    }

    /**
     *get gives the PizzasSize
     * @return PizzasSize
     */
    public String getPizzasSize() {
        return pizzasSize;
    }

    /**
     *get gives the Quantity
     * @return Quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *get gives the Sauce
     * @return Sauce
     */
    public Sauces getSauce() {
        return sauce;
    }

    /**
     *get gives the Side
     * @return side
     */
    public Sides getSide() {
        return side;
    }

    /**
     *get gives the SideSize
     * @return SideSize
     */
    public String getSideSize() {
        return sideSize;
    }

    /**
     *get gives the Drink
     * @return Drink
     */
    public Drinks getDrink() {
        return drink;
    }

    /**
     *get gives the Cheese
     * @return cheese
     */
    public Cheese getCheese() {
        return cheese;
    }

    /**
     *get gives the Dessert
     * @return dessert
     */
    public Desserts getDessert() {
        return dessert;
    }

    /**
     *get gives the Cost
     * @return cost
     */
    public Double getCost() {
        return cost;
    }
    
    private double calcDessertCost()
    {
        return dessert.getDessertPrice();
    }
    
    private double calcSauceCost()
    {
        return sauce.getPriceOfSauce();
    }
    
    private double calcCheeseCost()
    {
        return cheese.getCheesePrice();
    }
        
    private double calcDrinkCost()
    {
        return drink.getDrinkPrice();
    }
    
    private double calcSideCost()
    {
      double price=0.0;
      if(sideSize.equalsIgnoreCase("small"))
      {
          price = side.getSmallSidesPrice();
      }
      
      if(sideSize.equalsIgnoreCase("family"))
      {
          price = side.getFamilySidesPrice();
      }
      
      if(sideSize.equalsIgnoreCase("party"))
      {
          price = side.getPartySidesPrice();
      }
      
      return price;
    }
    
    /**
     *calculate the PizzasCost
     * @return price
     */
    public double calcPizzasCost()
    {
      double price = 0.0;
      if((pizzasName.equals(pizzasName.HANDTOSSED_PIZZA)))
      {
          if(pizzasSize.equalsIgnoreCase("small"))
          price = PizzaTypes.HANDTOSSED_PIZZA.getSmallPizzaPrice();
          
          else if(pizzasSize.equalsIgnoreCase("medium"))
          price = PizzaTypes.HANDTOSSED_PIZZA.getMediumPizzaPrice();
          
          else if(pizzasSize.equalsIgnoreCase("large"))
          price = PizzaTypes.HANDTOSSED_PIZZA.getLargePizzaPrice();
      } 
      
      else if((pizzasName.equals(pizzasName.PAN_PIZZA)))
      {
          if(pizzasSize.equalsIgnoreCase("small"))
          price = PizzaTypes.PAN_PIZZA.getSmallPizzaPrice();
          
          else if(pizzasSize.equalsIgnoreCase("medium"))
          price = PizzaTypes.PAN_PIZZA.getMediumPizzaPrice();
          
          else if(pizzasSize.equalsIgnoreCase("large"))
          price = PizzaTypes.PAN_PIZZA.getLargePizzaPrice();
      } 
      return price;
    }
    
    /**
     *calculate the Discount
     * @param orderDate
     * @return dis price
     */
    public double calcDiscount(String orderDate) 
    {
        double disprice = 0.0;
        if(Days.isDiscountDay(orderDate))
        {
            if(pizzasName.equals(pizzasName.HANDTOSSED_PIZZA))
            {
                disprice = (quantity * calcPizzasCost())/2;
            }
        }
        return disprice;
    }
    
    /**
     *calculate the TotalCost
     * @param orderDate
     * @return cost
     */
    public double getTotalCost(String orderDate)
    {
        cost = (calcSauceCost()+calcDessertCost()+calcCheeseCost()
                +calcDrinkCost()+calcSideCost())+calcPizzasCost()*quantity;
        return cost;
       
    }
    
    /**
     *overrides the toString method
     * @param orderDate
     * @return pizzaName,pizzasSize,quantity,sauce,side,sideSize,cheese
     */
    public String toString(String orderDate)
    {
        return ("PIZZA TYPE: "+pizzasName+"\nPIZZA SIZE: "+pizzasSize.toUpperCase()
                +"\nQUANTITY: "+quantity+"\nSAUCE: "+sauce+"\nSIDES: "+side+" "
                        + "("+sideSize.toUpperCase()+")"+"\nCHEESE: "+cheese+"\nDRINKS:"
                                + " "+drink+"\nDESSERTS: "+dessert+"\nCOST:"
                                        + " "+((Math.round(cost*100))/100.0))
                .replaceAll("_", " ");
    }
    
}

    
    

