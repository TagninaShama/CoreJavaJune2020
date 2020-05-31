package test2Practice;
import java.util.ArrayList;
import java.util.HashSet;

public class COLLECTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> examGrades = new ArrayList<Integer>();
		examGrades.add(100);
		examGrades.add(95);
		examGrades.remove(1);
		for(int i = 0; i<examGrades.size(); i++)
		{
			System.out.println(examGrades.get(i));
			System.out.println(examGrades.get(i));
		}
		HashSet <String> studentEmails = new HashSet<String>();
		studentEmails.add("bob@uga.edu");
		studentEmails.add("jill@uga.edu");
		studentEmails.add("kaguar@uga.edu");
		for(String emailAddress: studentEmails)
		{
			System.out.println(emailAddress);
		}


	}

}
