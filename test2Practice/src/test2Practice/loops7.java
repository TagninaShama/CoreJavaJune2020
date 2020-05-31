package test2Practice;

import java.util.Scanner;

public class loops7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		String userInputT = keyboard.nextLine();
		String userInputS = keyboard.nextLine();

		boolean foundMismatch = userInputS.length() != userInputT.length();

		if (!foundMismatch) {
			for (int i = 0; i < userInputT.length(); i++) {
				if ((userInputT.charAt(i)) != userInputS.charAt(i)) {
					foundMismatch = true;
					break;
				}
			}
		}

		System.out.println(foundMismatch ? "Mismatch" : "Match");
	}

}
