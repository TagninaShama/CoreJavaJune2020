public class Item {
	
	protected int itemNumber;
	private double price;
	private String description;
	
	//two constructors
	public Item() {
		itemNumber = -1;
		price = 0;
		description = "TBD";
	}
	
	public Item(double p, String d, int i) {
		itemNumber = i;
		price = p;
		description = d;
	}
	
	//accessors and mutators

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}