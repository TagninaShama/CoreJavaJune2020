import java.util.*;
public class Main {

	public static void main(String[] args) {
	   
	   Company c = new Company();
	   c.addManager("Tina Fey", 5000 , "Athens, Ga", 10);
	   c.getEmployeeDatabase().get(0).print();
	   
	   int[] a = {1,2,3};
	   int[] b = a;
	   b[1] = 2000;
	   System.out.println(b[1]); //Is this 2 or 2000? Why?
	   System.out.println(b);
	   System.out.println(a);
	   
	
}