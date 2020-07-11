package hw3Q3Inheritance01;

public class TestAnimal {

	public static void main(String[] args) {

		//Under the main method create object from each class 
		//and call their own method by their own object. 
		System.out.println("\n*****************************");
		Animal animal = new Animal(); // default Constructor initialize
		animal.animalInfo();
		
		System.out.println("\n*****************************");
		Birds birds = new Birds();
		birds.birdsInfo();
		
		System.out.println("\n*****************************");
		Dog dog = new Dog();
		dog.dogInfo();
		
		System.out.println("\n*****************************");
		Mammal mammal = new Mammal(); // class is instantiated when object is created
		mammal.mammalInfo();
		
		System.out.println("\n*****************************");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		
		System.out.println("\n*****************************");
		Robin robin = new Robin();
		robin.robinInfo();
		
		System.out.println("\n*****************************");
		Snake snake = new Snake();
		snake.snakeInfo();
		
		
	}

}
