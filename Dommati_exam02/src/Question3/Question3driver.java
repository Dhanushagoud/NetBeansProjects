/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;
        
import java.util.*;

/**
 *
 * @author DhanushaDommati
 */
public class Question3driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Loan(11.0));
        list.add(new Date());
        list.add(new String("Dhanusha"));
        list.add(new Circle(3.60));

        for (int i=0 ; i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }
    }

}
    
    

