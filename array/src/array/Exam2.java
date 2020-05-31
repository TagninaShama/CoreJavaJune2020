package array;
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
	
	 public String [] convertToArray(ArrayList <String> word){
	   
      String [] phrase = new String [word.size()];
      
      for (int i = 0 ; i < word.size() ; i++){
          //System.out.println(i);
          phrase[i] = word.get(i);
      }
      return phrase;
      }
	
	/*
	Question 2
	Write a method named threeVowels() that accepts an HashSet 
	of type String as its parameter and prints all Strings in the HashSet
	that contain at least 3 vowels
 	- Note: this method must modify the *original* HashSet 
 	  (no need to return anything)

	Example:
 	- HashSet input: [banana, dog, Vatican, Halloween, zebra, rosemary]
 	- Printed output: banana Vatican Halloween rosemary 
 	--//note the order of these may vary 
	 */
	
	public void threeVowels(HashSet<String> copy) {
		char[] vowel = {'a', 'e', 'i','o', 'u'};
		String [] arr = new String [copy.size()];
		int count = 0;
		for (String list: copy) {
			arr[count] = list;
			count++;
			}
	for(int i = 0; i < arr.length; i++) {
		int counter = 0;
		for (int j = 0; j <arr[i].length(); j++) {
			if ( arr[i].char[j]); == vowel [i])
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
// 		ArrayList<String> myitems = new ArrayList<String>();
// 			myitems.add("milk");
// 		   myitems.add("chips");
// 		   myitems.add("shampoo");
// 		   myitems.add("legos");
// 		   myitems.add("honey");
		
		
		groceryStore.generateFiveOrders(); 
		
		System.out.print("Enter an order number: ");
		
		//YOUR CODE HERE! - Do not modify above!
		
	
	}
}