/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

import java.util.logging.Logger;

/**
 *
 * @author DhanushaDommati
 */
public class Vehicle {
    private String Brand;

    public Vehicle(String Brand) {
        this.Brand = Brand;
    }

    public String getBrand() {
        return Brand;
    }
   public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    @Override
    public String toString() {
        return "vechile{" + "Brand=" + Brand + '}';
    }
    
    
    
}
