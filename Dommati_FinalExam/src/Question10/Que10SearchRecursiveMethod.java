/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.List;

/**
 *
 * @author DhanushaDommati;]\
 */
public class Que10SearchRecursiveMethod  {
     public static String searchInAList(List<String> list, String searchText) {

        if (list.isEmpty()) {
            return null;
        }

        String firstElement = list.remove(0);
        if (firstElement.equals(searchText)) {
            return firstElement;
        }else{
            return searchInAList(list, searchText);
        }
        
    }
}
