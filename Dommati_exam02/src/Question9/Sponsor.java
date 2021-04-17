/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author DhanushaDommati
 */
public class  Sponsor implements MusicPlayer,Finacial {

    @Override
    public void start() {
        System.out.println("start");
    }
       

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void spon() {
        System.out.println("sponsor");
       }
    
    
}

   