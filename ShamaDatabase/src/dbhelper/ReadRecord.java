package dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Product;


public class ReadRecord {

	private Connection connection;
	private ResultSet results;
	
	private Product product = new Product();
	private String SKU;
	
	public ReadRecord(String dbname, String root, String pwd, String SKU) {
		String url = "jdbc:mysql://localhost:3306/" + dbname + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	this.SKU = SKU;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, root, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead(){
		String query = "Select * From products Where SKU = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.SKU);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			product.setSKU(this.results.getString(1));
			product.setProductType(this.results.getString("ProductType"));
			product.setFlavor(this.results.getString("Flavor"));				
			product.setCost(this.results.getDouble("Cost"));
			product.setPrice(this.results.getDouble("Price"));
			product.setQuantity(this.results.getInt("Quantity"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Product getProduct(){
		return this.product;
	}
}
