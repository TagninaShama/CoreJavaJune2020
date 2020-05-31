package test2Practice;

import java.util.Scanner;

public class loops8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a word: ");
			String s = keyboard.nextLine();
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				if (Character.isLowerCase(s.charAt(i)) == true) {
					count++;
				}
			}
			System.out.println(count);

		}

	}

}
