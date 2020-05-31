/* 
* [BankTransaction].java 
* Authors: [Zachary Reynolds, April Okoukoni, Tagnina Shama, Ruolan Ding] 
* Submission Date:[11/29/2018] 
* 
* Purpose: This program is a text-based game that runs a game akin to the “The Bank”.
This class 

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
* written consent from the MIS Department. 
* 
*/


import java.util.*;
public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard= new Scanner(System.in);
		ArrayList<String> password= new ArrayList<String>();
		BankTeller one= new BankTeller();
		BankTeller two= new BankTeller();
		two.setBranch_location("Athens,GA");
		two.setName("Georga Costanza");
		two.setSalary(50000);
		
		Bank theBank= new Bank();
		theBank.addBankTeller(one);
		theBank.addBankTeller(two);

		
		System.out.println("Hello, welcome to 'The Bank', our virtual banking system.");
		System.out.println("We at the 'The Bank' thank you for taking the time to explore the system. "+"Enjoy!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Please specify your profession:");
		String jobTitle= keyboard.nextLine();
		boolean proceed = true;
		while (proceed) 
		{
		
		if(jobTitle.equalsIgnoreCase("Bank Teller")) 
		{
			System.out.println("");
			one.Menu();
		}
		else {
			System.out.println("Sorry, we do not have that profession.");
			System.out.println("Thank you for spending time at 'The Bank'!");
			System.out.println("Goodbye!");
			System.exit(0);
		}
	
		
		}
	}
}

