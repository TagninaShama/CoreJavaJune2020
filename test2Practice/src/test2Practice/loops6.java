package test2Practice;

import java.util.Scanner;

public class loops6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		boolean takingInput = true;
		while (takingInput) {
			System.out.println("enter a word");
			String userInput = keyboard.nextLine();
			if (userInput.equals("done")) {
				takingInput = false;
			}
			else if(userInput.charAt(0) == userInput.charAt(userInput.length()-1)) {
				System.out.println("first equals last");
			}
			else
			{
				System.out.println("first not equal last");
			}
		}

	}

}
