
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DhanushaDommati
 */
public class LabDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Lib L1 = new Lib ("Thomas",23);
        System.out.println(L1);
        
        Scanner scan = new Scanner (new File("libary.txt"));
        PrintWriter write=new PrintWriter(new File("output.txt"));
        while(scan.hasNext()){
        //System.out.println("enter the name of book");
        String name= scan.next();
        //scan.nextLine();
        //System.out.println("enter the number of books");
        int count = scan.nextInt();
        
        
        Lib L2 = new Lib (name, count);
        System.out.println(L2);
        write.println(L2);
         }
        scan.close();
        write.close();
    }
}
