package refactoring;

import java.util.Vector;

class Customer {
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        StringBuilder result = new StringBuilder("refactoring.Rental Record for " + getName() + "\n");

        for (Rental each : _rentals) {
            result.append("\t").append(each.get_movie().getTitle());
            result.append("\t").append(each.getCharge());
            result.append("\n");
        }

        //add footer lines
        result.append("Amount owed is ").append(getTotalCharge());
        result.append("\n");
        result.append("You earned ").append(getTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental each : _rentals) {
            result += each.getCharge();
        }
        return result;
    }
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental each : _rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }


}
