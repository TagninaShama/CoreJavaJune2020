package model;

public class Product {
private String SKU;
private String ProductType;
private String Flavor;
private Double Price;
private Double Cost;
private int Quantity;

public Product(String SKU, String productType, String flavor, Double price, Double cost, int quantity) {
	this.SKU = SKU;
	this.ProductType = productType;
	this.Flavor = flavor;
	this.Price = price;
	this.Cost = cost;
	this.Quantity = quantity;
}
public Product() {
	this.SKU = "empty";
	this.ProductType = "empty";
	this.Flavor = "empty";
	this.Price = 1.00;
	this.Cost = 1.00;
	this.Quantity = 0;
	
}
/**
 * @return the su
 */
public String getSKU() {
	return SKU;
}
/**
 * @param sku the sku to set
 */
public void setSKU(String SKU) {
	this.SKU = SKU;
}
/**
 * @return the productType
 */
public String getProductType() {
	return ProductType;
}
/**
 * @param productType the productType to set
 */
public void setProductType(String ProductType) {
	this.ProductType = ProductType;
}
/**
 * @return the flavor
 */
public String getFlavor() {
	return Flavor;
}
/**
 * @param flavor the flavor to set
 */
public void setFlavor(String Flavor) {
	this.Flavor = Flavor;
}
/**
 * @return the price
 */
public Double getPrice() {
	return Price;
}
/**
 * @param price the price to set
 */
public void setPrice(Double Price) {
	this.Price = Price;
}
/**
 * @return the cost
 */
public Double getCost() {
	return Cost;
}
/**
 * @param cost the cost to set
 */
public void setCost(Double Cost) {
	this.Cost = Cost;
}
/**
 * @return the quantity
 */
public int getQuantity() {
	return Quantity;
}
/**
 * @param quantity the quantity to set
 */
public void setQuantity(int Quantity) {
	this.Quantity = Quantity;
}
@Override
public String toString() {
	return "Product [SKU=" + SKU + ", ProductType=" + ProductType + ", Flavor=" + Flavor + ", Price=" + Price
			+ ", Cost=" + Cost + ", Quantity=" + Quantity + "]";
} 
}
