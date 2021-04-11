/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("studentdata.txt"));
        ArrayList<Student> students = new ArrayList<>();

        while (scan.hasNext()) {
            Student s = new Student(scan.nextInt(), scan.next(), scan.next(), scan.nextDouble());
            // System.out.println(s);
            students.add(s);
        }
        System.out.println("Raw List");
        printList(students);
        System.out.println("*************");
        System.out.println("Sorting based on last name");
         System.out.println("Overriding the natural order sorting");
        Collections.sort(students);
        
    }
     private static void printList(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }

    }
    
}
