/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucks;

import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class StarbucksDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char order='Y';
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Welcome to Starbucks *****");
        while(order == 'Y')
        {
        System.out.print("Please enter the full name (Firstname Lastname): ");
        String name = sc.nextLine();
        while(name.equals(""))
        {
            System.out.print("Please enter the full name (Firstname Lastname): ");
            name = sc.nextLine();
        }
        System.out.print("Please enter the Address: ");
        String address = sc.nextLine();
        while(address.equals(""))
        {
        System.out.print("Please enter the Address: ");
        address = sc.nextLine(); 
        }
        System.out.print("Please enter Contact Number: ");
        String phoneNumber = sc.nextLine();
        while(phoneNumber.equals(""))
        {
          System.out.print("Please enter Contact Number: ");
          phoneNumber = sc.nextLine();  
        }
        System.out.print("Please enter Customer Type(Regular/New): ");
        String type = sc.nextLine();
        while(!type.equals("Regular") && !type.equals("New"))
        {
          System.out.print("Please enter Customer Type(Regular/New): ");
          type = sc.nextLine();  
        }
        Starbucks obj=new Starbucks(name,address,phoneNumber,type);
        obj.setOrder(name);
        int quantity;
        char add;
        int item;
        System.out.println("\n!*!*!*!*! Welcome Board" +obj.getCustomerName()+"!*!*!*!*!\n");
        do{
        System.out.println("Select items from following list\n" +
"	1.Ham & Swiss Panini\n" +
"	2.Cheese & Fruit Bistro Box\n" +
"	3.Turkey Pesto Panini\n" +
"	4.Salted Caramel or Birthday Cake Pop\n" +
"	5.Roasted Tomato & Mozzarella Panini");
        item=sc.nextInt();
        
        while(item <1 || item>5)
         {
             System.out.println("Please choose the number 1 to 5");
             item=sc.nextInt(); 
             
         }
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();
        obj.updateReceipt(quantity, item);
        System.out.print("Do you want to add one more item(Y/N))? ");
        add = sc.next().charAt(0);
        
        }while(add == 'Y');
             
        System.out.println("Bill amount is "+obj.getFinalBillAmount());
        System.out.print("Enter the cash paid: $");
        double cash = sc.nextDouble();
        System.out.println("***************************************");
        obj.printReceipt(cash);
        sc.nextLine();
        System.out.println("--------------------");
        System.out.println("***************************************");
        System.out.print("Do you want add one more order(Y/N))? ");
        order = sc.next().charAt(0);
        sc.nextLine();
        }
        
        System.out.println("Thank you!");
        sc.close();
    }
    
}
        
    
