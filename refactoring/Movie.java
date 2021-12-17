package refactoring;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private Price _price;

    public Movie(String title, int price) {
        this._title=title;
        set_priceCode(price);
    }
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((getPriceCode().getPriceCode() == Movie.NEW_RELEASE)
                && daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }


    public String getTitle() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public void set_priceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public Price getPriceCode() {
        return _price;
    }
}

