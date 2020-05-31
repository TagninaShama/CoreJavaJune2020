import java.util.*;
public class Teacher extends Student {

	private int price;
		public Teacher() //default construtor
		{
			
			}
		
		public Teacher(int Id)
		{
			this.Id = Id;
			number = 0;
		}
		public void setPrice(int carID, int price)
		{
			//ArrayList <Integer> car = new ArrayList <Integer> ();
			
		}
		ArrayList <Integer> section = new ArrayList <Integer> ();
		public void itr() {
			for (Integer r: section) {
					System.out.print(r);
			}
		}
		
		@Override
		public void Example() {
			// TODO Auto-generated method stub
		}
		HashMap <Integer, Princi> area = new HashMap <Integer, Princi> ();
		
		public void hash(int id) {
		for (Princi f: area.values() ) {
			if(id == f.find) //find~variable 
				//do something
				System.out.print("s");
		}
		}
		

}
