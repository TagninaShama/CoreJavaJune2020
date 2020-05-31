package dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Product;

public class UpdateQuery {
	
	private Connection connection;
	
	public UpdateQuery(String dbname, String root, String pwd) {
		String url = "jdbc:mysql://localhost:3306/" + dbname + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, root, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		
	public void doUpdate(Product product){
		String query = "update products set ProductType=?, Flavor=?, Cost=?, Price = ?, Quantity = ? where SKU=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);

			
			ps.setString(1, product.getProductType());
			ps.setString(2, product.getFlavor());
			ps.setDouble(3, product.getCost());
			ps.setDouble(4, product.getPrice());
			ps.setInt(5, product.getQuantity());
			ps.setString(6, product.getSKU());
			
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
