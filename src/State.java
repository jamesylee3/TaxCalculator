import java.util.Scanner;
public class State {

    private String name;
    private String abbreviation;
    private double taxRate;

    public State(String name, String abbreviation, double taxRate) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public String toString() {
        return name;
    }

    public void calculateTax (double itemPrice) {
        double priceAfterTax = (itemPrice + (itemPrice * taxRate));
        System.out.println(name + " has a tax percentage of " + (taxRate * 100) + "%. The total price after tax is: $" + priceAfterTax);
    }

}
