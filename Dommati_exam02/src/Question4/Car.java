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
public class Car extends Vehicle{
     private String modelName;

    public Car(String modelName, String Brand) {
        super(Brand);
        this.modelName = modelName;
    }

    
    public String getModelName() {
        return modelName;
    }
  
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "car{" + "modelName=" + modelName + '}';
    }
     
    
}
