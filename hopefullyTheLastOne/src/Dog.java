public abstract class Dog implements Pet{
	
	private String name;
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		name=name;
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Woof woof woof!");
	}
}   
    