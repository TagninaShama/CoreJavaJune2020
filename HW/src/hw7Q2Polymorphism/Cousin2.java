package hw7Q2Polymorphism;
/* Create another class Cousin2 and inherit Cousin1. 
 * Override all the possible methods by changing logic. 
 * If some methods are not possible to override, 
 * please explain why by comments. 
 * Initialize all the methods in TestFamily class.
 * 
 * */

public class Cousin2 extends Cousin1{
	
	//can't override final method
	//@Override //Static type Method (5) implemented
    //The method ageofCousins of type Cousin2 must override or implement a
	//super type method (from super type class), not a static method (because static is a local method of a class)
	//So, static method can't be override, if we remove @override it will work as
	//static method of this cousin2 class.

	//void type
	@Override
		public void ageOfCousins() {
			System.out.println("This is a void type");
		}
		//parametarized type
	@Override
		public void ageOfCousins(int age1, int age3, String age4, int age5, int age6) {
			int DOB = 10/25/1957;
			System.out.println("DOB is: "+DOB);
		}
		//return type
	@Override
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
	//The method ageofCousins of type Cousin2 must override or implement a
		//super type method (from super type class), not a static method (because static is a local method of a class)
		//So, static method can't be override, if we remove @override it will work as
		//static method of this cousin2 class.
		//final type
//		public final int ageOfCousins(int age1, int age2, int age6) {
//			int DOB = 10/25/1957;
//			System.out.println("DOB is: "+DOB);
//			return DOB;
	//can't override final method
		//@Override //Static type Method (5) implemented
}
