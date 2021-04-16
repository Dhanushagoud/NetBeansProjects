/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4Example2;

/**
 *
 * @author DhanushaDommati
 */
public class Bicycle {
    public int gear;

    public Bicycle(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "gear=" + gear + '}';
    }
    
    
}
