/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Dhanusha Dommati
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public enum PizzaTypes {

    /**
     *
     */
    HANDTOSSED_PIZZA(10.50, 13.50, 16.50),

    /**
     *
     */
    PAN_PIZZA(9.50, 12.50, 15.50);
    
    private final double smallPizzaPrice;
    private final double mediumPizzaPrice;
    private final double largePizzaPrice;

    private PizzaTypes(double smallPizzaPrice, double mediumPizzaPrice, double largePizzaPrice) {
        this.smallPizzaPrice = smallPizzaPrice;
        this.mediumPizzaPrice = mediumPizzaPrice;
        this.largePizzaPrice = largePizzaPrice;
    }

    /**
     *get gives the SmallPizzaPrice
     * @return SmallPizzaPrice
     */
    public double getSmallPizzaPrice() {
        return smallPizzaPrice;
    }

    /**
     *get gives the MediumPizzaPrice
     * @return MediumPizzaPrice
     */
    public double getMediumPizzaPrice() {
        return mediumPizzaPrice;
    }

    /**
     *get gives the LargePizzaPrice
     * @return LargePizzaPrice
     */
    public double getLargePizzaPrice() {
        return largePizzaPrice;
    }
        
}
    

