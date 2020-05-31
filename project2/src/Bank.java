/* 
* [BankTeller].java 
* Authors: [Zachary Reynolds, April Okoukoni, Tagnina Shama, Ruolan Ding] 
* Submission Date:[11/29/2018]
* 
* Purpose: This program is a text-based game that runs a game akin to the “The Bank”.
*This class acts like a bank application for employees to view and input information. Restricted with specific deposit or withdraw amount. Categorized employee’s performance into four different categories with different amount of raise. 
 
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

public class Bank {

	HashMap<Integer, Employee> employeeDB = new HashMap<Integer, Employee>();
	Scanner keyboard= new Scanner(System.in);	
	
	public HashMap <Integer, Employee> getEmployeeDB()
	{
		return employeeDB;
	}
	
	/*
	 * Add BankTeller method: Polymorphism  since its adds type BankTeller to super class Employee
	 */
	public void addBankTeller(BankTeller t)
	{
		t = new BankTeller();
		employeeDB.put(t.getId(), t);
	}
	
}

