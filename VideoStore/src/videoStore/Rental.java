package videoStore;
public class Rental
{
	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}
	
	public Movie getMovie () {
		return movie;
	}
	
	private Movie movie;
	private int daysRented;
	
	public String getTitle() {
		return movie.getTitle();
	}

	double determineAmount() {
		return movie.determineAmount(daysRented);
	}
	
	int determineFrequentRenterPoints() {
		return movie.determineFrequentRenterPoints(daysRented);
	}
}