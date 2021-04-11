/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dhanusha Dommati
 */
public class ExhibitorTestor 
{
	public static void main(String[] args) throws IOException
	{
		final int CURRENT_YEAR = 2006;
		Exhibitor exhibitor1;
		Scanner myReader = new Scanner(new File("Exhibitor.txt"));
		String lastNameIn;
		String firstNameIn;
		int yearOfBirthIn;
		int pointsIn;
		int numEventsIn;
		ArrayList<Exhibitor> myList = new ArrayList<Exhibitor>();
				
		while(myReader.hasNext())
		{
			lastNameIn = myReader.next();
			firstNameIn = myReader.next();
			yearOfBirthIn = myReader.nextInt();
			pointsIn = myReader.nextInt();
			if(CURRENT_YEAR - yearOfBirthIn > 18)
			{
				exhibitor1 = new Amateur(lastNameIn, firstNameIn,
						yearOfBirthIn, pointsIn);
			} else
			{
				numEventsIn = myReader.nextInt();
				exhibitor1 = new Youth(lastNameIn, firstNameIn,
						yearOfBirthIn, pointsIn, numEventsIn);
			}
			myList.add(exhibitor1);
		}
		
		for(Exhibitor exh : myList)
		{
			System.out.println(exh + " " + 
					((CURRENT_YEAR - exh.getYearOfBirth() > 18) ? "Amateur" : "Youth") +
					" " + exh.worldShowQualified());
		}
		
		exhibitor1 = new Amateur();
		exhibitor1.setLastName("Dommati");
		exhibitor1.setFirstName("Uma");
		exhibitor1.setYearOfBirth(1964);
		exhibitor1.setPoints(100);
		System.out.println();
		System.out.print(exhibitor1.getFirstName() + " ");
		System.out.print(exhibitor1.getLastName() + " ");
		System.out.print(exhibitor1.getYearOfBirth() + " ");
		System.out.println(exhibitor1.getPoints());
		
		exhibitor1 = new Youth();
		exhibitor1.setLastName("Dommati");
		exhibitor1.setFirstName("Naresh");
		exhibitor1.setYearOfBirth(1967);
		exhibitor1.setPoints(100);
		((Youth)exhibitor1).setNumEvents(4);
		System.out.println();
		System.out.print(exhibitor1.getFirstName() + " ");
		System.out.print(exhibitor1.getLastName() + " ");
		System.out.print(exhibitor1.getYearOfBirth() + " ");
		System.out.print(exhibitor1.getPoints() + " ");
		System.out.println(((Youth)exhibitor1).getNumEvents());
	}	
}
