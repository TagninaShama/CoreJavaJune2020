package dbHelp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

import model.Cart;


public class CartHasMoviesQuery {

	public Connection connection;
	public ResultSet results;
	
	private Cart cart = new Cart();
	private String userName;
	int custID;
	int cartID;
	double subtotal;
	double bookingFee=3;
	double total = subtotal + bookingFee;
	
	public CartHasMoviesQuery(String dbName, String root, String pwd, int custID, int cartID){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		this.custID= custID;
		this.cartID= cartID;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, root, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void getCartInfo(int cartID, int custID){
		String query = "Select * from cart_has_Movies Join cart On cart.cartID = cart_has_Movies.cartID where cart.customerID = ?";		
		try {
			PreparedStatement ps= this.connection.prepareStatement(query);
			
			ps.setInt(1, this.custID);
			
			this.results= ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCartTable() {
		String table= "";
		table +="<head><link href=./style/style.css type=text/css rel=stylesheet></head>";
		table +="<table>";
		table += "<tr>"	;
		table += "<td>ITEM NAME</td>";
		table += "<td>QUANTITY</td>";
		table += "<td>PRICE</td>";
		table += "</tr>";
		try {
			while(this.results.next()) {
				cart.setCartId(this.results.getInt("cartID"));
				cart.setMovieName(this.results.getString("movieName"));
				cart.setPrice(this.results.getDouble("price"));
				cart.setQuantity(this.results.getInt("quantity"));

			table += "<tr>"	;
			table += "<td>"	+ cart.getMovieName() + "</td>"	;
			table += "<td>"	+ cart.getPrice() + "</td>";
			table += "<td>" + cart.getQuantity() + "</td>";		
			table += "<td>"	;
			table += "<a href=update?cartID=" + cart.getCartId() + ">update</a> <a href=delete?cartID=" + cart.getCartId()+ ">delete</a>";
			table += "</td>";		
			table += "</tr>"	;
			
			subtotal = subtotal + cart.getPrice();
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		total = subtotal + bookingFee;
		table +="<tr><td colspan=4> Subtotal: $" + subtotal + "</td></tr>" ;
		table +="<tr><td colspan=4> Booking Fee: $" + bookingFee + "</td></tr>" ;
		table +="<tr><td colspan=4> Total: $" + total + "</td></tr>" ;
		table +="</table>";
		return table;
	}

}
