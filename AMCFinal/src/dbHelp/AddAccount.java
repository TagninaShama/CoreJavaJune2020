package dbHelp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Customer;


public class AddAccount {
	
	public Connection connection;
	
	public AddAccount(String dbName, String root, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, root, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAdd(Customer customer){
		String query = "insert into customer(customerID, firstName, lastName, customerPhoneNo, emailAddress, password) values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, customer.getCustomerID());
			ps.setString(2, customer.getFirstName());
			ps.setString(3, customer.getLastName());
			ps.setString(4, customer.getCustomerPhoneNo());
			ps.setString(5, customer.getEmailAddress());
			ps.setString(6, customer.getPassword());

			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
