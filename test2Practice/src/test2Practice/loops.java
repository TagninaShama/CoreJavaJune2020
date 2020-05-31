package test2Practice;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	char letter = 'o';
		
	Scanner keyboard = new Scanner(System.in);
	
	String word = keyboard.nextLine();
	boolean found = false;
	
	for(int i = 0; i< word.length(); i++)
	{
		if(word.charAt(i) == letter)
		{
			found = true;
			
		}
	}
	if (found == true ) {
		System.out.println("correct");
	}
	else 
		System.out.println("incorrect");
	}

}
