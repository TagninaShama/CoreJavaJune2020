 
/* 
* [BankTeller].java 
* Authors: [Zachary Reynolds, April Okoukoni, Tagnina Shama, Ruolan Ding] 
* Submission Date:[11/29/2018]
* 
* Purpose: This program is a text-based game that runs a game akin to the “The Bank”.
This class acts like a bank application for employees to view and input information. Restricted with specific deposit or withdraw amount. Categorized employee’s performance into four different categories with different amount of raise. 
 
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
* */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BankTeller extends Employee {//Inheritence
	
	Scanner keyboard= new Scanner(System.in);
	private static String bank_name;
	protected String branch_location;
	protected double[] depositAmount= {20.00, 50.00, 100.00, 500.00, 1000.00};
	protected double[] withdrawAmount={20.00, 50.00, 100.00, 500.00, 1000.00};
	private double newCustomerBalance=20000.00;
	private static ArrayList<String> performance= new ArrayList<String>();
	private static HashSet<Double> raise = new HashSet<>();

	
	@Override
	public void Menu() {
			System.out.println("What would you like to do today?");
			System.out.println("Make a deposit press [1]");
			System.out.println("Make a withdrawal press [2]");
			System.out.println("View your employee performance press [3]");
			System.out.println("Log out press [4]");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
			int choice = keyboard.nextInt();
			switch (choice)
			{
			case 1:
				System.out.println("Enter the amount you would like to deposit");
				System.out.println("You may deposit $20, $50, $100, $500, or $1000 into your account");
				double depositAmt=keyboard.nextDouble();
				deposit(depositAmt);
				break;
			case 2:
				System.out.println("You may withdraw $20, $50, $100, $500, or $1000 from your account");
				double withdrawAmt=keyboard.nextDouble();
				withdraw(withdrawAmt);
				break;
			case 3:
				ratePerformance();
				break;
			case 4:
				System.out.println("You chose to log off");
				System.out.println("Goodbye.");
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
				System.exit(0);
				}
			
		}
	
	public void populatePerformance() {
	 performance.add(new String("Poor"));
	 performance.add(new String("Average"));
	 performance.add(new String("Good"));
	 performance.add(new String("Excellent"));
	}
	
	public void populateRaise() {
	raise.add(new Double(100.0));	
	raise.add(new Double(500.0));	
	raise.add(new Double(1000.0));	

	}
	
	public ArrayList<String> getPerformance() 
	{
		return performance;
	}
	
	public HashSet<Double> getRaise()
	{
		return raise;
	}
	
	public void ratePerformance() {
		System.out.println("Please enter how you would be rated as an employee.");
		System.out.println("[1] for 'Excellent', [2] for 'Good', [3] for 'Average', and [4] for'Poor'.");
		int rating= keyboard.nextInt();
		//BankTeller t= new BankTeller();
		populatePerformance();
		populateRaise();
		for(int i=0; i< getPerformance().size(); i++) {
			for (Double k: getRaise()) {
		if (rating == 1) {
				getPerformance().get(i).equalsIgnoreCase("Excellent"); 
				setSalary(getSalary()+ k);
				System.out.println("Good job! You're an excellent employee and you get a raise of $" + k);	
				return;
			}	

		else if (rating==2){
				getPerformance().get(i).equalsIgnoreCase("Good");
			//for (Double k: t.getRaise()) {
				setSalary(getSalary()+ k);
			System.out.println("Good job! You're a good employee and you get a raise of $" + k);
			return;
		}
		else if (rating == 3) {
			System.out.println("You're an average employee. Please try to work harder");
			return;
			}
			
		else if	(rating == 4) {
			System.out.println("You're a poor employee. Please try to work harder");
			return;
		}
		else 
		{
			System.out.println("You entered a number that is not a rating");
			break;
		}	
			}}
	}
	public double deposit(double amt) 
	{		
		if(amt == depositAmount[0]) {
			newCustomerBalance= newCustomerBalance + amt;
			System.out.println("You have deposited $20 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == depositAmount[1]) {
			newCustomerBalance= newCustomerBalance + amt;
			System.out.println("You have deposited $50 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == depositAmount[2]) {
			newCustomerBalance= newCustomerBalance + amt;
			System.out.println("You have deposited $100 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == depositAmount[3]) {
			newCustomerBalance= newCustomerBalance + amt;
			System.out.println("You have deposited $500 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == depositAmount[4]) {
			newCustomerBalance= newCustomerBalance + amt;
			System.out.println("You have deposited $1000 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else {
			System.out.println("You have entered an amount I am not authorized to deposit.");
			System.out.println("Please try again!");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
	}
	public double withdraw(double amt) 
	{		
		if(amt == withdrawAmount[0]) {
			newCustomerBalance= newCustomerBalance - amt;
			System.out.println("You have withdrawn $20 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == withdrawAmount[1]) {
			newCustomerBalance= newCustomerBalance - amt;
			System.out.println("You have withdrawn $50 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == withdrawAmount[2]) {
			newCustomerBalance= newCustomerBalance - amt;
			System.out.println("You have withdrawn $100 into your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == withdrawAmount[3]) {
			newCustomerBalance= newCustomerBalance - amt;
			System.out.println("You have withdrawn $500 from your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else if(amt == withdrawAmount[4]) {
			newCustomerBalance= newCustomerBalance - amt;
			System.out.println("You have withdrawn $1000 from your account");
			System.out.println("You now have: $" + newCustomerBalance+ " in your account");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;
		}
		else {
			System.out.println("You have entered an amount I am not authorized to withdraw");
			System.out.println("Please try again!");
			System.out.println("---------------------------------------------------------------------------------------");
			return newCustomerBalance;	
		}
	}
	@Override
	public void print()
	{
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + employeeName);
		System.out.println("Salary: $" + salary);
		System.out.println("Branch Location: " + branch_location);
		System.out.println("---------------------------------");
	}

	/*
	 * Getters and Setters
	 */

	public String getBranch_location() {
		return branch_location;
	}

	public void setBranch_location(String branch_location) {
		this.branch_location = branch_location;
	}

	public double getCustomer_balance() {
		return newCustomerBalance;
	}
	
	/*
	 * Constructor
	 */
	public BankTeller() 
	{
	branch_location= "Atlanta, GA";
	
	}
}
