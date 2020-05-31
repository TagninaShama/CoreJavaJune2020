import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exam2
{
	/*
	Question 1
	Write a method named convertToArray() that accepts an 
	ArrayList of type String as its parameter and returns 
	an array containing the same elements in the ArrayList.

	Example ArrayList (input) and array (return):
 	- ArrayList input: [acing, exam, two]
 	- Returned array: [acing, exam, two]
	 */
	public String[] convertToArray(ArrayList <String> arr) {
		String[] str = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			str[i] = arr.get(i);
		}
		return str;
	}

	/*
	Question 2
	Write a method named threeVowels() that accepts an HashSet 
	of type String as its parameter and prints all Strings in the HashSet
	that contain at least 3 vowels
 	-Note: this method simply prints Strings to the console and 
 	should not modify the HashSet or return anything.


	Example:
 	- HashSet input: [banana, dog, Vatican, Halloween, zebra, rosemary]
 	- Printed output: banana Vatican Halloween rosemary 
 	--//note the order of these may vary 
	 */

	public void threeVowels(HashSet<String> string) {
		String[] newArray = string.toArray(new String[string.size()]);
//	 String [] newArray = string.toArray();
		for (int i = 0; i < newArray.length; i++) {
			int counter = 0;
			for (int j = 0; j < newArray[i].length(); j++) {
				if (newArray[i].charAt(j) == 'a' || newArray[i].charAt(j) == 'e' || newArray[i].charAt(j) == 'o'
						|| newArray[i].charAt(j) == 'u' || newArray[i].charAt(j) == 'A' || newArray[i].charAt(j) == 'E'
						|| newArray[i].charAt(j) == 'I' || newArray[i].charAt(j) == 'O' || newArray[i].charAt(j) == 'U')
					counter++;
				if (counter == 3) {
					System.out.print(newArray[i]);
					break;
				}
			}
		}
	}
	/*
	 * Question 3
	 * Step 0: Inspect the Order.java and Store.java classes to see
	 * how they work - Do not modify these files!
	 * 
	 * Complete the printOrder method below so that it:
	 *
	 *  - Reads an int orderNum from the user
	 *  - Searches through the ArrayList of Orders in the Store class
	 *    (hint: this list has an accessor!) 
	 *    checking if each Order object's orderNum
	 *    matches the orderNum entered from the user.
	 *  - If an Order object with the specified order number is found,
	 *     - Print that Order object's info (there's a method for that!)
	 *     
	 *     Sample I/O is above in Description
	 */
	public void printOrder(Scanner keyboard)
	{
		//Creates a new Store object
		Store groceryStore = new Store();
		
		//creates and adds 5 Order objects to groceryStore's ArrayList of Orders
	    groceryStore.generateFiveOrders(); 
	    ArrayList<Order> stores = groceryStore.getOrders();
		
	//	System.out.print("Enter an order number: ");
		int orderNum = keyboard.nextInt();
		for(int i = 0; i <stores.size(); i++){
		   if(stores.get(i).getOrderNum() == orderNum)
		//if(stores.getOrderNum(stores.get(i)) == orderNum)
		System.out.print("Order Number: " + orderNum + " Price: " + stores.get(i).getPrice());
		//YOUR CODE HERE! - Do not modify above!
		}
	/*
	Question 3
	 * Step 0: Inspect the Order.java and Store.java classes to see
	 * how they work - Do not modify these files!
	 * 
	 * Complete the printOrder method below so that it:
	 *
	 *  - Reads an int orderNum from the user
	 *  - Searches through the ArrayList of Orders in the Store class
	 *    (hint: this list has an accessor!) 
	 *    checking if each Order object's orderNum
	 *    matches the orderNum entered from the user.
	 *  - If an Order object with the specified order number is found,
	 *     - Print that Order object's info (there's a method for that!)
	 *     
	 *     Sample I/O is above in Description
	 */
	public void printOrder(Scanner keyboard) {
		// Creates a new Store object
		Store groceryStore = new Store();

		// creates and adds 5 Order objects to groceryStore's ArrayList of Orders
		groceryStore.generateFiveOrders();
		System.out.print("Enter an order number");
		int orderNum = keyboard.nextInt();

		for (int i = 0; i < groceryStore.getOrders().size(); ++i) {
			if (orderNum == groceryStore.getOrders().get(i).getOrderNum()) {
				groceryStore.getOrder().get(i).print();
			} 
		}
		
	}
}