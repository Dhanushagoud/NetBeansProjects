/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Que06CheckedException;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author DhanushaDommati
 */
public class CheckedExpectionExample02 {

    /**
     * @param args the command line arguments
     */
    private static final String CLASS_TO_FIND = "com.mysqldhanu.jdbc.Driver";
 
    public static void main(String[]  args) throws Exception{
        System.out.println("Opening the JDBC driver");
        Class.forName(CLASS_TO_FIND);
    }
}
    
    

