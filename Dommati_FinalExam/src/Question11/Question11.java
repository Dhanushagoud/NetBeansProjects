/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author DhanushaDommati
 */
public class Question11 {
    public static class MyClass{
     private int id;
    public MyClass(int id) {
        this.id=id;
        }
     public int getId() {
        return id;
        }
     public void setId(int id) {
        this.id = id;
        }
 @Override
        public boolean equals(Object o) {

            if (this == o) 
                return true;
            
            if (o == null || getClass() != o.getClass()) 
                return false;
            
            MyClass myClass = (MyClass) o;
            return id == myClass.id;
        }

        @Override
        public int hashCode() {

            return Objects.hash(id);
        }
    }
    
}
