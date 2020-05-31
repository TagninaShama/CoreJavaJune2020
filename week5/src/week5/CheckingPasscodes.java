package week5;

public class CheckingPasscodes {
	   public static void main (String [] args) {
	      boolean hasDigit;
	      String passCode;

	      hasDigit = false;
	      passCode = "abc";
char let1;
char let2;
char let3;
      
	      
	      let1=passCode.charAt(0);
	      let2=passCode.charAt(1);
	      let3=passCode.charAt(2);
	      
	      
	      if (Character.isDigit(let1)|| Character.isDigit(let2) || Character.isDigit(let3)) { 
	      hasDigit = true;
	      }
	      else {
	      hasDigit= false;
	}
	      if (hasDigit) {
	         System.out.println("Has a digit.");
	      }
	      else {
	         System.out.println("Has no digit.");
	      }
	   }
	}
