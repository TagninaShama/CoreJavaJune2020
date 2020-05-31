package dbHelp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.customer;


public class ReadLogIn {

	private Connection connection;
	private ResultSet results;
	
	customer customer  = new customer();
	private String customerID;
	
	public ReadLogIn(String dbname, String root, String pwd, String customerID) {
		String url = "jdbc:mysql://localhost:3306/" + dbname + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	this.customerID = customerID;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, root, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead(){
		String query = "select * from Customer where customerID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.customerID);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			customer.setCustomerID(this.results.getInt(1));
			customer.setFirstName(this.results.getString("firstName"));
			customer.setLastName(this.results.getString("lastName"));
			customer.setEmailAddress(this.results.getString("emailAddress"));
			customer.setPassword(this.results.getString("password"));
			customer.setCustomerPhoneNo(this.results.getString("customerPhoneNo"));
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public customer getCustomer(){
		return this.customer;
	}
}
