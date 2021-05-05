/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Que06CheckedException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 *
 * @author DhanushaDommati
 */
public class CheckedExpectionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1= new Student();
         File file = new File("hello.txt");
        try {
            InputStreamReader inputStreamReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    }
    

