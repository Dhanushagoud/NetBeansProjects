/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class Question1Driver {

    private static ArrayList<Integer> listwithoutDup = new ArrayList<>();

    public static void removeDuplicate(ArrayList<Integer> list) {
        //ArrayList<Integer> listwithoutDup = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }

        }
        listwithoutDup=list;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for(int i=0;list.size() < 10;i++) {
            list.add(scan.nextInt());

        }
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (int i : listwithoutDup) {
            System.out.print(i + " ");

        }
    }
}
