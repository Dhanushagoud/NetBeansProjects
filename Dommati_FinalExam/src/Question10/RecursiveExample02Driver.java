/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author DhanushaDommati
 */
public class RecursiveExample02Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        greetingMessage(5);
    }
    public static void greetingMessage(int i)
    {
        if (i==0)
        {
            System.out.println("If not infinity");
        }
        else
            {
            System.out.println("Hello Dr.Ajay Bandi");
            i++;
                        greetingMessage(i);

        }
    }
    
}
