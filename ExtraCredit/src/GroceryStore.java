import java.util.ArrayList;
import java.util.Scanner;
public class GroceryStore {
		
	private ArrayList<Item> itemsInStore = new ArrayList<Item>();
	
	//accessor
	public ArrayList<Item> getItemsInStore(){
		return itemsInStore;
	}
	
	/*
	 * Creates a new item with specified price, description, 
	 * and itemNumber passed into method.
	 * Adds the item to the ArrayList
	*/
	public void addItem(double price, String description, int itemNumber) {
		
		Item i = new Item(price, description, itemNumber);
		itemsInStore.add(i);
	}
	
	/*
	 * Searches the ArrayList for an item with a matching itemNumber
	 * to the parameter. If an Item object with the same itemNumber
	 * is found, this method should update that Item's price so that it
	 * is reduced by 10%.
	 * 
	 * Example: 
	 * 	If there exists an Item in the ArrayList 
	 *  with itemNumber = 3 and price = 10.0,
	 *  and the itemNumber passed into the putOnSale method is 3, then:
	 *   - the Item with itemNumber = 3 has it's price updated (set) to 9.0
	 *   // (price = price - (price*.10))
	 */
	public void putOnSale(int itemNumber) {
		// Your code here!
		// itemsinstore.get (i).get (itemnumber

		for (int i = 0; i < itemsInStore.size(); ++i) {
			if (itemsInStore.get(i).getItemNumber()== itemNumber) {
				itemsInStore.get(i).setPrice(
						itemsInStore.get(i).getPrice() - (itemsInStore.get(i).getPrice() * .10));
 
			}
		}
	}

}
