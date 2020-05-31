import java.util.Scanner;
		
public class Colors {
		
public static void main(String[] args) {
		
int wavelength;
String color;

System.out.println("Enter the wavelength: ");

Scanner keyboard = new Scanner(System.in);

wavelength = keyboard.nextInt( );

		if (wavelength > 640) 
		color = "Red";
		
		else if (wavelength > 600)
		color = "Orange";
		
		else if (wavelength > 560)
		color = "Yellow";
		
		else if (wavelength > 480)
		color = "Green";
		
		else if (wavelength > 450)
		color = "Blue";
		
		else if (wavelength > 400)
		color = "Violet";
		
		else
		color = "Invisible";
		
		System.out.println("Wavelength = " + wavelength);
		System.out.println("Color = " + color);
		
	}

}
