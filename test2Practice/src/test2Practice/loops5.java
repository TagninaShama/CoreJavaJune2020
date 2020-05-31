package test2Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class loops5 {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		String userInput = keyboard.nextLine();
		
		for (int i = userInput.length()-1 ; i >= 0; i--)
		{
			System.out.print(userInput.charAt(i));
		}
		

	}
	*/

	public ArrayList <String> storeBackwards(Scanner keyboard) {
	     ArrayList <String> word = new ArrayList <String> ();
	     String userInput = "";
	      userInput = keyboard.nextLine();
	      String backwards = "";
	      int count = 0;
			while (!(userInput.equalsIgnoreCase ("done"))) {
	            userInput = keyboard.nextLine();
	           
				   for (int i = userInput.length()-1 ; i >= 0; i--){
				      backwards = backwards + userInput.charAt(i);
				      word.add(backwards); 
				      
			      }
			      
			      backwards = "";
			      
			   }
			   return word;
			}

}