package hw7Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println("\n........... Method overloading .............\n");
				Cousin1 num = new Cousin1();
				num.ageOfCousins();//void type
				num.ageOfCousins(10, 30,"35",50, 60); //parametarized type 
				num.ageOfCousins(10, 20, 30, "35", 50, 60); //return type
		        Cousin1.ageOfCousins(10, 20, "35", 60); //Static Method initialize by class directly
		        num.ageOfCousins(10, 20, 60); //Final Method initialize
		        
		        
		        System.out.println("\n........... Method overriding .............\n");
		        Cousin2 num2 = new Cousin2();
		        num2.ageOfCousins();//void type
				num2.ageOfCousins(10, 30,"35",50, 60); //parametarized type 
				num2.ageOfCousins(10, 20, 30, "35", 50, 60); //return type
			    Cousin2.ageOfCousins(10, 20, "35", 60); //Static Method initialize by class directly
			}

		}



