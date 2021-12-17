package refactoring;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        if (daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}
