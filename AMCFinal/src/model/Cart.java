package model;

public class Cart {
private int childTickets;
private int adultTickets;
private int quantity;
private String movieName;
private int cartId;
private double price;
/**
 * @return the quantity
 */
public int getQuantity() {
	return quantity;
}
/**
 * @param quantity the quantity to set
 */
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
/**
 * @return the movieName
 */
public String getMovieName() {
	return movieName;
}
/**
 * @param movieName the movieName to set
 */
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
/**
 * @return the cartId
 */
public int getCartId() {
	return cartId;
}
/**
 * @param cartId the cartId to set
 */
public void setCartId(int cartId) {
	this.cartId = cartId;
}

public void setCartId() {
	this.cartId = cartId;
}
private final double  child = 5.99;
private final double adult = 7.99;
private int customerId;

public int getAdultTickets() {
	return adultTickets;
}
public void setAdultTickets(int adultTickets) {
	this.adultTickets = adultTickets;
}
public int getChildTickets() {
	return childTickets;
}
public void setChildTickets(int childTickets) {
	this.childTickets = childTickets;
}

public double totalChild(){
	return child * childTickets;
}

public double totalAdult() {
	return adult * adultTickets;
}

public double total() {
	price = (child * childTickets) + (adult * adultTickets);
	return price;
}
public double total(int kid, int adu) {
	price = (child * kid) + (adult * adu);
	return price;
}
public int totalQuan() {
	int quan = childTickets +  adultTickets;
	return quan;
}
public int totalQuan(int kid, int adu) {
	int quan = kid +  adu;
	return quan;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getCustomerID() {
	// TODO Auto-generated method stub
	return customerId;
}
public void setCustomerId(int i) {
	// TODO Auto-generated method stub
	this.customerId = i;
}





}


