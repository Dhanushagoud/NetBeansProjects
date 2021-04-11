/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelexpenses;

import java.util.Scanner;

/**
 *
 * @author DhanushaDommati
 */
public class RouteDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int flag=0;
        int routeNo;
        int numpassengers;
        boolean isMember;
        boolean haveCoupon;
        boolean isFirstTimeUser;
        Scanner object= new Scanner(System.in);
        System.out.print("Enter User Details:");
        System.out.print("Select the routes from 1, 2 and 3:");
        routeNo=object.nextInt();
        System.out.print("How many number of passengers:");
        numpassengers=object.nextInt();
        System.out.println("Are you a member:");
        isMember=object.nextBoolean();
       System.out.print("Are you a first time user:");
       isFirstTimeUser=object.nextBoolean();
       System.out.print("DO you have coupon");
       haveCoupon=object.nextBoolean();
         if(routeNo==0 || routeNo>4)
         {
         System.out.println("Route number should be 1 or 2 or 3");
         flag=1;
         }
         if(numpassengers==0)
         {
         System.out.println("Passenger number can't be zero");
         flag=1;}
        if(isMember==true && isFirstTimeUser==true )
        {
         System.out.println("User cannot be a member and first time user at a time");
         flag=1;
        }
        if(flag==1)
            System.out.println("Please try again");
        else{
        RouteCalculator obj1=new RouteCalculator(routeNo, numpassengers, 
                isMember, isFirstTimeUser, haveCoupon);
            System.out.println("\n");
            System.out.println("*******************************");
            System.out.println("\n");
            System.out.println("User Route details:");
            System.out.println(obj1);
            System.out.println("\n");
            System.out.println("*******************************");
            System.out.println("\n");
            System.out.println("Receipt");
            System.out.println(obj1.printReceipt());
        }            
    }    
    }
    

