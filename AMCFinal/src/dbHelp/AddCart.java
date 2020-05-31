package dbHelp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;


import model.Cart;
import model.Customer;


public class AddCart {
	
	public Connection connection;
	public int cartID;

	
	public AddCart(String dbName, String root, String pwd){
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
	
	public void doCart(Cart cart, int custID, int cartId){
		String query = "insert into Cart(cartID, customerID) values (?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1, cartId);
			ps.setInt(2, custID);
			
			cart.setCartId(cart.getCartId());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doAddMovies(Cart cart){
		String query = "insert into Cart_has_Movies(cartID, movieName, price, quantity) values (?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			cart.setCartId();
			ps.setInt(1, cart.getCartId());
			ps.setString(2, cart.getMovieName());
			ps.setDouble(3, cart.getPrice());
			ps.setInt(4, cart.getQuantity());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}