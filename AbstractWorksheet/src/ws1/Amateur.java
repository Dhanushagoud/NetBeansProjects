/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws1;

/**
 *
 * @author Dhanusha Dommati
 */
public class Amateur extends Exhibitor
{
	private static final int PTS_NEEDED = 150;
	
	public Amateur()
	{
		super();
	}
	public Amateur(String lastName, String firstName, int yearOfBirth, int points)
	{
		super(lastName, firstName, yearOfBirth, points);
	}
	@Override
	public boolean worldShowQualified()
	{
		return getPoints() >= PTS_NEEDED;
	}
}
