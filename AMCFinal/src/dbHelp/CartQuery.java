package dbHelp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

import model.Customer;


public class CartQuery {

	public Connection connection;
	public ResultSet results;
	
	private Customer customer = new Customer();
	private String userName;
	int cartID;
	
	public CartQuery(String dbName, String root, String pwd, String userName){
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
	
	public void createCartID(){
		String query = "Select cartID from cart Join customer on customer.customerID = cart.customerID where emailAddress = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.userName);
			
			this.results= ps.executeQuery();
			
			this.results.next();
			
			cartID= this.results.getInt("cartID");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int getCartID() {
		return cartID;
	}
}
