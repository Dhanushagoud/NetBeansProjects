/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DhanushaDommati
 */
public class Question08MultiExecptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws FileNotFoundException, IOException {
        // TODO code application logic here
        File file = new File("Multiple.txt");
        InputStreamReader inputStreamReader = new FileReader(file);
        inputStreamReader.read();
    }
    }
    

