/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author DhanushaDommati 
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //a. String Declaration 
        String string1 = "    Welcome       ";
        String string2 = " to   ";
        String string3 = "    the       ";
        String string4 = " Lab Activity";
        String string5 = "  in   ";
        String string6 = "  OOP Course ";
        
        //b. concate and length of the String 
        
        String concatinatedString = string1.concat(string2)
                .concat(string3).concat(string4)
                .concat(string5).concat(string6);
        
        System.out.println(concatinatedString);
        System.out.println("The length of the concatenated string is: " + concatinatedString.length());
        
        //c. concate String
        String concatinatedStringWithSpace = string1.trim().concat(" ")
                .concat(string2.trim()).concat(" ").concat(string3.trim()).concat(" ")
                .concat(string4.trim()).concat(" ").concat(string5.trim()).concat(" ").
                concat(string6.trim()).concat("!");
        
        System.out.println(concatinatedStringWithSpace);
        System.out.println("The length of the concatenated string With Space is: " + concatinatedStringWithSpace.length());
       
        //d.
       String labActivity = concatinatedStringWithSpace.substring(15, 28);
       System.out.println(labActivity);
       System.out.println(labActivity.toUpperCase() + ": " + labActivity.toUpperCase().indexOf("I"));
       
       //2.a
       
       String labActvities = "lab interesting activities are activities lab Interesting Lab Activities Are Interesting Lab activities Lab Interesting";
       System.out.println(labActvities.indexOf("Interesting"));
       
       //2.b
       String OOPS = "Object-Oriented-Programming 44542";
       System.out.println(OOPS);
       System.out.println(OOPS.replaceAll("-", "_").replaceAll(" ", "-"));
       
       //2.c
       String comp = "Computer";
       String sci = "Science";
       
        System.out.println(comp.substring(0, 4)
                .concat(sci.substring(0, 3).toUpperCase())+comp.length()+sci.length());

        //2.d
        System.out.println("To Updagrade my knowledge");
       
       //3.a 
       int value1 = 9;
       int value2 = 13;
   
       System.out.println("sqrt " + Math.hypot(value1, value2));
       
       System.out.println(Math.exp(value1));
       System.out.println(1 / Math.cos(value1));
       
       int twentySeven = 27; 
       double myNumber = Math.cbrt(twentySeven);
       System.out.println(Math.log(myNumber));
      
       System.out.println((Math.tan(60) - Math.tan(45)) / (1 + (Math.tan(60)*Math.tan(45))));
       
       System.out.println(Math.cbrt(Math.tan(90)));
       
       double cos = Math.cos(30);
       double sec = 1/Math.cos(30);
       System.out.println("Cos of 30 is: " + cos);
       System.out.println("Secant of 30 is: " + sec);
       System.out.println("" + Math.max(cos, sec));
       System.out.println("" + Math.min(cos, sec));
       
       int myNumber1 = 45;
       int myNumber2 = 27;
       
       System.out.println(Math.round(Math.cos(myNumber1)));
       System.out.println(Math.round(Math.cos(myNumber2)));
       System.out.println(Math.round(Math.tan(myNumber1)));
       System.out.println(Math.round(Math.tan(myNumber2)));
       
       double upper = Math.pow((Math.pow(7, 4) + (8*7*6*5)), 1/4);
       double below = Math.pow((Math.pow(5, 2) - Math.pow(3, 2)), 1/8);
       
       double result = (Math.cbrt(8 * Math.cos(myNumber2))) * (upper / below);
       
        System.err.println("Value of the Result is: " + result);
       randomGenerator(false);
       randomGenerator(true);
    }

    private static void randomGenerator(boolean isSeed) {
        //3.b
        Random random = new Random();
        if(isSeed) {
            random.setSeed(30);
        }
        int firstRandom = random.nextInt(200);
        int secondRandom = random.nextInt(200);
        int thirdRandom = random.nextInt(200);
        int fourthRandom = random.nextInt(200);
        
        String value = isSeed ? " withSeed " : " withoutSeed ";
        
        System.out.println("First random integer" + value + "is: " + firstRandom + " square of " + Math.pow(firstRandom, 2));
        System.out.println("Second random integer" + value + "is: " + secondRandom + " square of " + Math.pow(secondRandom, 2));
        System.out.println("Third random integer" + value + "is: " + thirdRandom + " square of " + Math.pow(thirdRandom, 2));
        System.out.println("Fourth random integer" + value + "is: " + fourthRandom + " square of " + Math.pow(fourthRandom, 2));
        
        System.out.println("Fifth random integer" + value + "is: " + random.nextInt());
        System.out.println("Sixth random integer" + value + "is: " + random.nextInt());
        System.out.println("Seventh random integer" + value + "is: " + random.nextInt());
    }
    
}
