package test2Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class test2pra {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = storeBackwards(scan);
		for(String s : list) {
			System.out.println(s);
		}

	}

	public static ArrayList<String> storeBackwards(Scanner keyboard) {
		ArrayList<String> word = new ArrayList<String>();
		String userInput = "";
		userInput = keyboard.nextLine();
		String backwards = "";
		int count = 0;
		while (!(userInput.equalsIgnoreCase("done"))) {

			for (int i = userInput.length() - 1; i >= 0; i--) {
				backwards = backwards + userInput.charAt(i);

			}
			word.add(backwards);

			backwards = "";
			userInput = keyboard.nextLine();
		}

		return word;
	}

}
