package model;

public class Product {
private String sku;
private String productType;
private String flavor;
private Double price;
private Double cost;
private int quantity;
public Product() {
	super();
}
public Product(String sku, String productType, String flavor, Double price, Double cost, int quantity) {
	super();
	this.sku = sku;
	this.productType = productType;
	this.flavor = flavor;
	this.price = price;
	this.cost = cost;
	this.quantity = quantity;
}
/**
 * @return the sku
 */
public String getSku() {
	return sku;
}
/**
 * @param sku the sku to set
 */
public void setSku(String sku) {
	sku = sku;
}
/**
 * @return the productType
 */
public String getProductType() {
	return productType;
}
/**
 * @param productType the productType to set
 */
public void setProductType(String productType) {
	this.productType = productType;
}
/**
 * @return the flavor
 */
public String getFlavor() {
	return flavor;
}
/**
 * @param flavor the flavor to set
 */
public void setFlavor(String flavor) {
	this.flavor = flavor;
}
/**
 * @return the price
 */
public Double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(Double price) {
	this.price = price;
}
/**
 * @return the cost
 */
public Double getCost() {
	return cost;
}
/**
 * @param cost the cost to set
 */
public void setCost(Double cost) {
	this.cost = cost;
}
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
@Override
public String toString() {
	return "Product [Sku=" + sku + ", productType=" + productType + ", flavor=" + flavor + ", price=" + price
			+ ", cost=" + cost + ", quantity=" + quantity + "]";
} 
}
