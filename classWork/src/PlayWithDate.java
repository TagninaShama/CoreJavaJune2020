//import MY DATE CLASS!
import java.util.Date;

public class PlayWithDate {

	public static void main(String[] args) {
		
		//Scanner keyboard = new Scanner (system.in);
		// TODO Auto-generated method stub
		//constructor is a special method!
		
          Date today = new Date(); // call the Date constructor 
          
          //the above object created a date with the current time
          
          //march 20 1997
          //year, month, date
          Date kendrasBirthday = new Date(97,2,20); //1997
          
         // System.out.println(today.getMonth());
          
          
          //Cooper's birthday = March 28, 2009
          
          Date coopersBirthday = new Date();
          coopersBirthday.setYear(109);// 09...1909+100
          
          coopersBirthday.setMonth(2);
          
          coopersBirthday.setDate(28);
          
          int age = today.getYear() - kendrasBirthday.getYear();//get today's year - kendra's age
          System.out.println(age);
	}
	}

