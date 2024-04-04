import java.util.Scanner;
public class State {

    public String name;
    public String abbreviation;
    double taxRate;

    public State(String name, String abbreviation, double taxRate) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.taxRate = taxRate;
    }

    public void calculateTax (double itemPrice) {
        double priceAfterTax = (itemPrice + (itemPrice * taxRate));
        System.out.println(name + " has a tax percentage of " + (taxRate * 100) + "%. The total price after tax is: $" + priceAfterTax);
        }

}
