package reverse;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		String word = "";
		String hint = "";
		
		boolean done = true;
		
		do
		{
			//System.out.println("Enter word: ");
			word = keyboard.nextLine();
			
			if(word.equalsIgnoreCase("done")) 
			{
				done = false;
			}
			else {
				//System.out.println("Word: " + word);
				for(int i = word.length()-1; i >= 0; i--)
					
				{
					hint = word.replace((word.charAt(i)), '_');
				}
				
				System.out.println(hint);
				
				
				//hint = "";
			}
		}while(done);
	
	}
}
