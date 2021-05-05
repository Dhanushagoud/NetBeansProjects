/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import static Question10.Que10SearchRecursiveMethod.searchInAList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DhanushaDommati
 */
public class SearchRecursiveDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(searchInAList(list, "b"));
        System.out.println(searchInAList(list, "e"));
        
        list = new ArrayList<>();
        list.add("abc");
        list.add("pqr");
        list.add("usd");

        System.out.println(searchInAList(list, "pqr"));
        System.out.println(searchInAList(list, "dsf"));

        list = new ArrayList<>();
        list.add("Dhanu");
        list.add("Pravven");
        list.add("Uma");

        System.out.println(searchInAList(list, "Dhanu"));
        System.out.println(searchInAList(list, "Dommati"));


    }
}

    
    

