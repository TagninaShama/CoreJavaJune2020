package array;

import java.util.Scanner;

public class arrayPractice {
	public void printArray(String[]strArray)  
	{
		//loop through strArray to print out elements 
		for (int i =0; i < strArray.length; i++)
	    {
	    	System.out.println(strArray[i]);
	    }
		strArray[0] = "BOGUS";
	}
	
	public String[] populateArray(Scanner keyboard) //scanner keyboard = keyboard;
	                                              //String[] strArray = arrayAWESOME
	{
		
	    System.out.print("Enter the array size: ");
	    int size = keyboard.nextInt(); //[size]
	    
	    String[] strArray = new String[size];
	    
	    for (int i =0; i < strArray.length; i++) //strArray [0][1]....
	    {
	    	System.out.print("Enter the next array element: ");
	    	strArray[i]=keyboard.next();
	    }
	    //String[]array2 = strArray;
	    return strArray;
	}
	
	
	
	
	public static void main(String[] args) {
	
		//get String array from the user 
		//String[]strArray 
		Scanner keyboard = new Scanner(System.in);
		//String[] array2 = strArray;
		//populateArray(keyboard);
		
	    
	    //objName.methodName;
	    arrayPractice o = new arrayPractice();
	    String[] arrayAWESOME = o.populateArray(keyboard);
	    
	    o.printArray(arrayAWESOME);
	    System.out.println(arrayAWESOME[0]);
	}

}
