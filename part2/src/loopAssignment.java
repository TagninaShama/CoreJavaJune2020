import java.util.Scanner;

public class loopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =  new Scanner(System.in);
		
		/* System.out.println("Enter a number: ");
		int number = keyboard.nextInt();
	
		while (number >= 100)  
		 {
			System.out.println("Number outside of range. Try again.");
			number = keyboard.nextInt();
		 }
		*/
		String myString = keyboard.next();
		char myChar = 'a';
	    //start index int = i 
	    int end = myString.length()-1;
	    
	    for (int i =0; i < myString.length(); ++i)
	    {
	    
	    if (myString.charAt(i) == myChar)
	    	System.out.println("character found: " + i);
	    }
	    
	}

}
