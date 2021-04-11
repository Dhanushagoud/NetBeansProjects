/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethods;

/**
 *
 * @author Dhanusha Dommati
 */
public class MyClass implements Interface01,Interface02{
    //implement all abstract methods or make method abstract is the error message

    @Override
    public int foo(int myint) {
        System.out.println("Inside Myclass-foo");
        return myint * 2;
    }
   
     public int goo(String myString){
        System.out.println("Inside MyClass – goo");
   // return Interface02.super.goo(myString);
   return myString.lastIndexOf("o");
    
    }
    }

