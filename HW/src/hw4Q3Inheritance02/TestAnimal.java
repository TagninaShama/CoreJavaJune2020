package hw4Q3Inheritance02;

public class TestAnimal {

	public static void main(String[] args) {

		//Under the main method create object from each class 
		//and call their own method by their own object. 
		System.out.println("\n*****************************");
		Animal animal = new Animal(); // default Constructor initialize
		animal.animalInfo();
		//mammal,reptile and birds all can extend one single class ,animal class.this is called 
		//hierarchical inheritance
		//animal class is parent class here and mammal,reptile and bird class are child class which can inherit 
		//property of animal class
		
		System.out.println("\n*****************************");
		Birds birds = new Birds();
		birds.birdsInfo();
		animal.animalInfo();

		
		System.out.println("\n*****************************");
		Mammal mammal = new Mammal(); // class is instantiated when object is created
		mammal.mammalInfo();
        animal.animalInfo();
		//mammal class extends animal class this is called single inheritance
		//so all the that extends to another  here is single inheritance
		
		System.out.println("\n*****************************");
		Dog dog = new Dog();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();
		// dog extends to mammal and mammal extends to animal this is called 
		//multilevel inheritance
		
		
		System.out.println("\n*****************************");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		animal.animalInfo();

		
		System.out.println("\n*****************************");
		Robin robin = new Robin();
		robin.robinInfo();
		animal.animalInfo();
		
		System.out.println("\n*****************************");
		Snake snake = new Snake();
		snake.snakeInfo();
		animal.animalInfo();
		//snake extends to reptile, reptile  extends to  animal this is called 
		//multilevel inheritance
		
		System.out.println("\n*****************************");
		Bulldog bulldog = new Bulldog();
		bulldog.bulldogInfo();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();
		//bulldog extends to dog, dog extends to mammal and mammal extends to animal this is called 
		//multilevel inheritance
		
		System.out.println("\n*****************************");
		Cobra cobra = new Cobra();
		snake.snakeInfo();
		animal.animalInfo();
		cobra.cobraInfo();
		//cobra extends to snake, snake extends to reptiles and reptile extends to animal this is called 
		//multilevel inheritance
		

		
		
	}

}
