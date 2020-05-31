package model;

public class Movie {
	
	private String movieName;
	private String runningTime;
	private String rating;
	private String releaseDate;
	
	
	/**
	 * 
	 */
	public Movie() {
	}
	/**
	 * @param movieName
	 * @param runningTime
	 * @param rating
	 * @param releaseDate
	 */
	public Movie(String movieName, String runningTime, String rating, String releaseDate) {
		this.movieName = movieName;
		this.runningTime = runningTime;
		this.rating = rating;
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the runningTime
	 */
	public String getRunningTime() {
		return runningTime;
	}
	/**
	 * @param runningTime the runningTime to set
	 */
	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the releaseDate
	 */
	public String getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

}
