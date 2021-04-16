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
public class MountainBike extends Bicycle  {
    public int seatHeight;

    public MountainBike(int seatHeight, int gear) {
        super(gear);
        this.seatHeight = seatHeight;
    }

    

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return "MountainBike{" + "seatHeight=" + seatHeight + '}';
    }
    
  
}
