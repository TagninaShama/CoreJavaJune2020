package test2Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class practiceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceProblem no = new practiceProblem();
		// String s = no.noOdds();
		// System.out.println(s);

		practiceProblem on = new practiceProblem();
		ArrayList<String> results = on.noOddsList();
		for(int i = 0; i < results.size(); i++) {
			System.out.println(results.get(i));
		}
		
	}

	public String noOdds() {
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();

		char[] a = { '1', '3', '5', '7', '9' };
		for (int i = 0; i < a.length; i++) {
			userInput = userInput.replace(a[i], '*');

		}
		return userInput;

	}

	public String noORD() {
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();

		for (int i = 0; i < userInput.length(); i++) {
			char curLetter = userInput.charAt(i);

			if (Character.isDigit(curLetter)) {
				int digit = Integer.parseInt("" + curLetter);
				if (digit % 2 == 1) {
					String firstHalf = userInput.substring(0, i);
//					String secondHalf = userInput.substring(i+1);
					String secondHalf = userInput.substring(i + 1, userInput.length());
					userInput = firstHalf + '*' + secondHalf;
				}

			}
		}
		return userInput;

	}

	public ArrayList<String> noOddsList() {
		Scanner keyboard = new Scanner(System.in);

		ArrayList<String> results = new ArrayList<String>();
		boolean takingInput = true;
		
		while (takingInput) {
			System.out.println("enter a word");
			String userInput = noOdds();
			if (userInput.equals("done")) {
				takingInput = false;
			} else {
				results.add(userInput);
			}

		}
		return results;
	}

}
