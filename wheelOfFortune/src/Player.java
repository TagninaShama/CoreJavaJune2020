/* 
* [Player].java 
* Authors: [Zachary Reynolds, April Okoukoni, Tagnina Shama, Ruolan Ding] 
* Submission Date:[10/20/2018] 
* 
* Purpose: This program is a text-based game that runs a game akin to the “Wheel of Fortune”.
* The game has five phrases hard coded in and will be selected to be displayed to
* the player, albeit with all characters that are alphabetic being converted to underscores 
* so that the phrase is initially hidden to the player on the onset. The player then has to
* choose from four options; “Buy a Vowel”, “Guess a Consonant”, “Solve the Puzzle”, and exit. 
* The player starts off with 2000 dollars of in-game money and either win or lose money based
* off the outcome of another random number generator choosing what space the player 
* “lands on” on the “Wheel of Fortune”. The player, if they choose buy vowel will have money 
* deducted from their overall account, which is stored within the program. If account of
* in-game money goes below zero at any time, the game ends. The player at any time can guess 
* the hidden phrase. If the player correctly answers the phrase they receive a prize in-game 
* money. If they incorrectly guess the phrase they lose a set amount of in-game money. 
* The game progresses until all five phrases are solved, the player runs out of in-game funds,
* or they decide to exit the game. 
* 
* Statement of Academic Honesty:
* 
* The following code represents my own work. I have neither 
* received nor given inappropriate assistance. I have not copied 
* or modified code from any source other than the course webpage 
* or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
* the University of Georgia's Academic Honesty Policy and the 
* policies of this course. Any publishing 
* of source code for this project is strictly prohibited without 
* written consent from the MIS Department. */


import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Player {

public static void main(String[] args) {
		// Variables

		Scanner keyboard = new Scanner(System.in);
		Random ranGen = new Random();
		String[] arrayPhrases = { "Spongebob Squarepants", "Happy Halloween!", "Walking in a Winter Wonderland!!", "Bananas!", "Merry Christmas, Rudolph!!!" };
		String[] wheelOptions = { "200", "300", "400", "Bankrupt", "100", "50", "500", "Bankrupt" };
		GamePlay player = new GamePlay();
		System.out.println("From the University of Georgia, WELCOME TO THE WHEEL OF FORTUNE!!!");
		System.out.println("Your beginning balance is $2000!\n");
		for (int i = 0; i < arrayPhrases.length; i++) {
			player.clearGuessLetters();		
			System.out.println("Your puzzle to solve is:");
			String hiddenPhrase = player.hiddenPhrase(arrayPhrases[i]);
			System.out.println(hiddenPhrase);
			boolean advance = true;
			while (advance) {
				// Boolean statement to print menu when true
				System.out.println("\nChoose one of the options below by entering the '1', '2', '3', or '4'.");
				System.out.println("\nMain menu:");
				System.out.println("1. Buy a vowel");
				System.out.println("2. Guess a consonant");
				System.out.println("3. Solve the puzzle");
				System.out.println("4. Exit\n");

				String playerChoice = keyboard.next();

				switch (playerChoice) {
				case "1":
					System.out.println("What vowel would you like to buy?");
					String vowel = keyboard.next().toLowerCase();
					hiddenPhrase = player.buyVowel(arrayPhrases[i].toLowerCase(), vowel.toLowerCase().charAt(0), hiddenPhrase);
					System.out.println(hiddenPhrase);
					break;
				case "2":
					int wheelRandomize = ranGen.nextInt(wheelOptions.length);
					player.spinWheel(wheelOptions[wheelRandomize]);
					char standInConsonant='a'; 
					hiddenPhrase = player.buyConsonant(arrayPhrases[i].toLowerCase(), standInConsonant, hiddenPhrase);
					System.out.println(hiddenPhrase);
					break;
				case "3":
					System.out.println("You would like to solve the puzzle? What is your answer?");
					System.out.println("To get the phrase correct, you must include punctuation!");
					advance= !player.guessPhrase(arrayPhrases[i], hiddenPhrase);
					break;
				case "4":
					System.out.println("Thanks for play THE WHEEL OF FORTUNE!!!");
					advance = false;
					System.exit(0);
				default:
					System.out.println("");
					System.out.println("Please enter a number from 1 to 4 please");}
			}
		}
	}
}




