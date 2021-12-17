package refactoring;

class Rental {
    private final Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, DateRange dateRange) {
        _movie = movie;
        _daysRented = (int)((dateRange.getEnd().getTime() - dateRange.getStart().getTime()) / (1000 * 60 * 60 * 24));
    }
    public int getDaysRented() {
        return _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }
}
