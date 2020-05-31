///*import java.util.Scanner;
//public class examAverage {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//		
//		 String answer = "";
//do {
//		
//	int numExams = 0;  //total number of exams entered
//	int examTotal = 0;
//	
//	System.out.println("Enter exam scores to average - enter -1 when finished.");
//	
//	int examScore = keyboard.nextInt();
//	
//	while(examScore >= 0)
//	{
//		//count the number of exam scores
//		++numExams;
//		//sum the exam scores
//		examTotal = examTotal + examScore;
//		examScore = keyboard.nextInt();
//	}
//		//average
//	   double average = (double)examTotal / (double)numExams;
//	   
//	   System.out.println(average);
//	   
//	   System.out.println("Enter yes if you want to comput another average: ");
//	   
//	   answer = keyboard.next(); // yes, no, nope, bananas.....
//}
//	   
//	  while (answer.equalsIgnoreCase("yes")); //yes, YEs, 
//	     //do it all again
//	/*
//	 * 
//	 */
//		
//		
//		/* Scanner keyboard =  new Scanner(System.in);
//		
//		int numLines = keyboard.nextInt(); //3
//		int numStars = keyboard.nextInt();//5
//		
//		//write the inner loop first
//		
//	for(int j =0; j <=numLines; ++j)
//	{
//		for(int i = 1; i <= numStars; ++i)
//		{
//			System.out.print("*");
//			
//		}
//			System.out.println();
//	}
//		*/
//import java.util.Scanner;
//public class examAverage {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner keyboard = new Scanner(System.in);
//		
//		String word = "";
//		String hint = "";
//		
//		boolean done = true;
//		
//		do
//		{
//			//System.out.println("Enter word: ");
//			word = keyboard.nextLine();
//			
//			if(word.equalsIgnoreCase("done")) 
//			{
//				done = false;
//			}
//			else {
//				//System.out.println("Word: " + word);
//				for(int i = word.length()-1; i >= 0; i--)
//					
//				{
//					hint = word.replace((word.charAt(i)), '_');
//				}
//				
//				System.out.println(hint);
//				
//				
//				//hint = "";
//			}
//		}while(done);
//	
//	}
//}
//
//while (!phrase.equalsIgnoreCase("done"))
//{
//	//System.out.println(phrase);
//	for (int i = 0; i<=phrase.length()-1; i++ )
//	{
//		if (Character.isWhitespace(phrase.charAt(i)))
//		{
//			System.out.println(" ");
//		}
//		else
//		System.out.print("_");
//		}
//	System.out.println();
//	phrase = keyboard.nextLine();
//	
//}
//
//	
//{
//
//
//
//
//
//
//
//
//
//
//
//
