package test2Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	}

	public ArrayList<String> pal(Scanner keyboard) {
		ArrayList<String> pal = new ArrayList<String>();
		
		String userInput = keyboard.nextLine();
		while (!(userInput.equalsIgnoreCase("done"))) {
			//System.out.println("Enter a word: ");
			
			String backwards = "";

			for (int i = userInput.length() - 1; i >= 0; i--) {
				backwards = backwards + userInput.charAt(i);
			}

			//System.out.println(userInput);
			//System.out.println(backwards);

			if (userInput.equalsIgnoreCase(backwards)) {
				pal.add(userInput);
			}
		}
		return pal;
	}

}
