
//package array;
//import java.util.Scanner;
//public class ArraysAndMethods {
//	
//	public void findAndReplace(char[] array, char find, char replace) //char[] array = charArray
//	{
//		//loop through each element of array
//		for(int i =0; i<array.length; i++)
//		{
//			//if the element is equal to the find char
//			if(find == array[i])
//			{
//				//replace that element of the array with the replace char
//				array[i] = replace;
//			}
//		}
//	}
//	
//	
//	public void findAndReplace(char[] array, Scanner keyboard, Scanner replace) //char[] array = charArray
//	{
//		//loop through each element of array
//		for(int i =0; i<array.length; i++)
//		{
//			//if the element is equal to the find char
//			if(Scanner keyboard) == array[i])
//			{
//				//replace that element of the array with the replace char
//				array[i] = replace;
//			}
//		}
//	}
//	
//	/*TODO: Write an overloaded version of the findAndReplace method that accepts:
//	 * 1. a char array
//	 * 2. a Scanner object
//	 * 
//	 * And prompts the user for the character to find and character to replace in the array.
//	 * :)
//	 */
//	
//	public char[] copy(char[] array) //char[] array = _____
//	{
//		
//		char[] copiedArray = new char[array.length];
//		
//		for(int i =0; i<copiedArray.length; i++)
//		{
//			copiedArray[i] = array[i];
//		}
//		
//		return copiedArray;
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		ArraysAndMethods o = new ArraysAndMethods();
//		
//		char[] charArray = {'a','b','c','d'};
//		
//		//make a copy of that array
//		//char [] copiedArray = charArray; DOES NOT MAKE A COPY
//		
//		char[] copyArray = o.copy(charArray); //memory address
//
//		o.findAndReplace(charArray, 'a', 'x');
//		System.out.println(charArray[0]);
//
//	}
//}
//
//
