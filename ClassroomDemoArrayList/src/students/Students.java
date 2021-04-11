/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.util.ArrayList;

/**
 *
 * @author DhanushaDommati
 */
public class Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student obj1=new Student (1,"Dhanu",4.0);
        Student obj2=new Student (2,"Vineetha",3.0);
        Student obj3=new Student (3,"sushu",3.5);
        Student obj4=new Student (4,"Amulya",4.2);
        Student obj5=new Student (5,"Alekhya",4.5);
        
        ArrayList<Student> mystudents=new ArrayList <>();
        mystudents.add(obj1);
       mystudents.add(obj2);
        mystudents.add(obj3);
        mystudents.add(obj4);
        mystudents.add(obj5);
         double sum = 0;
        //avg
        for (int i = 0; i < mystudents.size(); i++) {
            sum += mystudents.get(i).getGpa();
        }
        // using enhanced for loop
         for (Student s: mystudents) {
            sum += s.getGpa();
        }
        
        
        System.out.println("Average: "+Math.round(sum / mystudents.size()*100.0)/100.0+"\n");
        //for highest gpa
        double max = 0;
        for (int i = 0; i < mystudents.size(); i++) {
            if (mystudents.get(i).getGpa() > max) {
                max = mystudents.get(i).getGpa();

            }

        }
       
        System.out.println("Maximum gpa: " + max+"\n");
        //Minimum Gpa
        double min = mystudents.get(0).getGpa();
        for (int i = 0; i < mystudents.size(); i++) {
            if (mystudents.get(i).getGpa() < min) {
                min = mystudents.get(i).getGpa();

            }

        }
        System.out.println("minimum is "+min);
        for(int i=0;i<mystudents.size();i++){
        if(mystudents.get(i).getName().charAt(0)=='s' || mystudents.get(i).getName().charAt(0)=='S'){
            System.out.println(mystudents.get(i).getName()+"\n");
        }
        }
        
        
        

    }

}
        
        
        
        
        
        
    
    

