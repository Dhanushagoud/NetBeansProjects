/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author DhanushaDommati
 */
public class Question5driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Person per=new Person("Dhanusha", "Park Way", "12345678", "Dhanu1995@gmail.com");
        Student stu=new Student("B","Undergrad", "Praveen", "Horizons", "87654329", "prav123@gmail.com");
        Employee emp=new Employee("Missouri", 80.0, "May 06", "Jeena", "Village O", "34562717", "Jeena123@gmail.com");
        Faculty fac=new Faculty(15, 4, "Missouri",50.0, "April 15", "Kinny", "Shamrock", "786653426", "Kinny0987@gmail.com");
        Staff staff=new Staff("Senior Lecturer", "Maryville", 20.0, "March 26", "Anusha", "Fox Alley", "342571282", "anu123@gmail.com");
        System.out.println(per);
        System.out.println(stu);
        System.out.println(emp);
        System.out.println(fac);
        System.out.println(staff);
         
    }
    
}

    
    

