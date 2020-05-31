import java.util.*;
public class Tailgate {
	private boolean isThirsty;
	private int numDrinks;
	private static int numDrinksInCooler = 0;
//private static int numDrinksInCooler = 0;
	
	public Tailgate()
	{
		//anytime a new Tailgate object us created!
		isThirsty = true;
		numDrinks = 0;
		//add 6 drinks to cooler!
		numDrinksInCooler = numDrinksInCooler+ 6;
	}
	
	public int getNumDrinks()
	{
		return numDrinks;
	}
	
	
	public static int getNumDrinksInCooler()
	{
		return numDrinksInCooler;
	}
	public void getDrinkFromCooler(Scanner keyboard)
	{
		//one less drink in cooler
		numDrinksInCooler--;
		//the calling objects num drinks should increment by 1 
		numDrinks++;
	}
	//bob.equals(jill) jill=t 
	//public boolean equals(Tailgate t)
	{	
		//if bobs numberOfDrinksIngested = jill's numberofDrinkINgested
		//return true 
		
//		if(numDrinks==t.getNumDrinks() && isThirsty==t.isThirsty)
//		{
//			
//		}
//		
//		
//		
//		this.numDrinks++;
//		//isHungry= false
//		System.out.println(numDrinks);
//		//t
	}
	
	
}
