package dbHelp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

import model.Customer;


public class CustomerQuery {

	public Connection connection;
	public ResultSet results;
	
	private Customer customer = new Customer();
	private String userName;
	int custID;
	
	public CustomerQuery(String dbName, String root, String pwd, String userName){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.userName= userName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, root, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createCustID(){
		String query = "Select customerID from customer where emailAddress = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.userName);
			
			this.results= ps.executeQuery();
			
			this.results.next();
			
			custID= this.results.getInt("customerID");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int getCustomerID() {
		return custID;
	}
}
