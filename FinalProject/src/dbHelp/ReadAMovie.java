package dbHelp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Movie;

/**
 * @author okouk
 *
 */
public class ReadAMovie {

	private Connection connection;
	private ResultSet results;
	
	private Movie movie = new Movie();
	private String movieName;
	
	public ReadAMovie(String dbName, String uName, String pwd, String movieName) {
		
		String url= "jdbc:mysql://localhost:3306/"  + dbName;
		this.movieName = movieName;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection= DriverManager.getConnection(url, uName, pwd);
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public void doRead() {
		String query = "Select * from Movies where movieName=?";

		try {
			PreparedStatement ps= connection.prepareStatement(query);
			
			ps.setString(1, this.movieName);
			
			this.results= ps.executeQuery();
			
			this.results.next();
			
			movie.setMovieName(this.results.getString("movieName"));
			movie.setRating(this.results.getString("rating"));
			movie.setReleaseDate(this.results.getString("releaseDate"));
			movie.setRunningTime(this.results.getString("runTime"));


			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public Movie getMovie() {
		return this.movie;
	}
		
}
