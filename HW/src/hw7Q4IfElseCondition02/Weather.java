package hw7Q4IfElseCondition02;

public class Weather {
/*Create a class Weather in package name "hw7Q4IfElseCondition". 
 * Initialize temperature -8 (minus 8) as variable. 
 * Write conditions for below outcome: 
 * The temperature is zero, 
 * The temperature is more than 0 and an odd number, 
 * the temperature is more than zero and an even number 
 * The temperature is less than 0 and an odd number, 
 * the temperature is less than zero and an even number.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature = -8;
		
		if(temperature == 0) {
			System.out.println("The temperature is zero.");
		}
		else if(temperature >0 && temperature%2 != 0) {
			System.out.println("The temperature is  more than zero and an odd number");
		}
		else if(temperature > 0 && temperature%2 == 0) {
			System.out.println("The temperature is  more than zero and an even number");
		}
		else if(temperature < 0 && temperature%2 != 0) {
			System.out.println("The temperature is  less than zero and an odd number");
		}
		else if(temperature <0 && temperature%2 == 0) {
			System.out.println("The temperature is  less than zero and an even number");
		}

	}

}
