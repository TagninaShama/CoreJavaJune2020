public class A implements Interface{
	private static int count = 0;
	@Override
	public void increment() {
		count++;
		System.out.println("Done");
	}

	@Override
	public void decrement() {
		// TODO Auto-generated method stub
		count--;
		System.out.println("Done");
	}

	@Override
	public void print() {
		System.out.println("The count is " + count);
		
	}
	
	

}
