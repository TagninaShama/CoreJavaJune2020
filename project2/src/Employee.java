  /* 
* [Employee].java 
* Authors: [Zachary Reynolds, April Okoukoni, Tagnina Shama, Ruolan Ding] 
* Submission Date:[11/29/2018]
* 
* Purpose: This program is a text-based game that runs a game akin to the “The Bank”.
This class is specifically designed to access employee’s information along with the id, salary, name, and the count of employees.
 
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
import java.util.HashSet;

public abstract class Employee {

		protected int employeeId; 
		protected String employeeName;
		protected double salary;
		private static int employeeCount = 0;
	     /*
		*Default Constructor
		*/
		
		public Employee()
		{
			employeeId = employeeCount;
			employeeName = "Joe Joe";
			salary = 0;
			employeeCount++;
		}
		/*
		 * Setters and Getters
		 */
		public int getId(){
			return employeeId;
		}
		public double getSalary(){
			return salary;
		}
		public String getName(){
			return employeeName;
		}
		public void setName(String name){
			employeeName = name;
			}
		
		public void setSalary(double salary)
		{
			salary = salary;
		}

		public void setId(int i)
		{
			employeeId = i;
		}

		public static int getEmployeeCount()
		{
			return employeeCount;
		}
		
		public abstract void print();
		public abstract void Menu();
	}

