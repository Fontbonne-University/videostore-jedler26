package videoStore;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title, Movie.NEW_RELEASE);
		// TODO Auto-generated constructor stub
	}

	double determineAmount(int daysRented) {
		double rentalAmount = 0;
		switch (priceCode) {
			case Movie.REGULAR:
				rentalAmount += 2;
				if (daysRented > 2)
					rentalAmount += (daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				rentalAmount += daysRented * 3;
				break;
			case Movie.CHILDRENS:
				rentalAmount += 1.5;
				if (daysRented > 3)
					rentalAmount += (daysRented - 3) * 1.5;
				break;
		}
		return rentalAmount;
	}

	int determineFrequentRenterPoints(int daysRented) {		
		boolean bonusIsEarned = (priceCode == Movie.NEW_RELEASE && daysRented > 1);
		if (bonusIsEarned)
			return 2;
		return 1;
	}

}
