package hw7Q2Polymorphism;

/*Create a class Cousin1. Can you create several methods with the same name inside it? Give the method name ageOfCousins. 
 * use int age1, int age2,int age3, String age4, int age5,int age6 etc as variable. Use void type, parameterized type, 
 * return type, static type, final type method by different combinations of the above variable. Tell me what is the Method 
 * overloading. initialize all the methods in TestFamily class. 
 * */

public class Cousin1 {
 //method overloading means same method name but different type of parameter/signature or different combination of parameter  
	
	//void type
	public void ageOfCousins() {
		System.out.println("This is a void type");
	}
	//parametarized type
	public void ageOfCousins(int age1, int age3, String age4, int age5, int age6) {
		int DOB = 10/25/1957;
		System.out.println("DOB is: "+DOB);
	}
	//return type
	public int ageOfCousins(int age1, int age2, int age3, String age4, int age5, int age6) {
	int DOB = 10/25/1957;
	System.out.println("DOB is: "+DOB);
	return DOB;
	}
	//static type
	public static int ageOfCousins(int age1, int age2, String age4, int age6) {
		int DOB = 10/25/1957;
		System.out.println("DOB is: "+DOB);
		return DOB;
	}
	//final type
	public final int ageOfCousins(int age1, int age2, int age6) {
		int DOB = 10/25/1957;
		System.out.println("DOB is: "+DOB);
		return DOB;
	}
	
	

}

