import java.util.Scanner;
public class TaxRates {
    // California
    private static final double TAX_PCT_RANK_1 = .0725;

    // Indiana, Mississippi, Rhode Island, Tennessee
    private static final double TAX_PCT_RANK_2 = .07;

    // Minnesota
    private static final double TAX_PCT_RANK_3 = .06875;

    // Nevada
    private static final double TAX_PCT_RANK_4 = .0685;

    // New Jersey
    private static final double TAX_PCT_RANK_5 = .06625;

    // Arkansas, Kansas, Washington
    private static final double TAX_PCT_RANK_6 = .065;

    // Connecticut
    private static final double TAX_PCT_RANK_7 = .0635;

    // Illinois, Massachusetts, Texas
    private static final double TAX_PCT_RANK_8 = .0625;

    // Utah
    private static final double TAX_PCT_RANK_9 = .061;

    // Florida, Idaho, Iowa, Kentucky, Maryland, Michigan, Pennsylvania, South Carolina, Vermont, West Virginia, District of Columbia
    private static final double TAX_PCT_RANK_10 = .06;

    // Ohio
    private static final double TAX_PCT_RANK_11 = .0575;

    // Arizona
    private static final double TAX_PCT_RANK_12 = .056;

    // Maine, Nebraska
    private static final double TAX_PCT_RANK_13 = .055;

    // Virginia
    private static final double TAX_PCT_RANK_14 = .053;

    // North Dakota, Wisconsin
    private static final double TAX_PCT_RANK_15 = .05;

    // New Mexico
    private static final double TAX_PCT_RANK_16 = .04875;

    // North Carolina
    private static final double TAX_PCT_RANK_17 = .0475;

    // Oklahoma
    private static final double TAX_PCT_RANK_18 = .045;

    // Louisiana
    private static final double TAX_PCT_RANK_19 = .0445;

    // Missouri
    private static final double TAX_PCT_RANK_20 = .04225;

    // South Dakota
    private static final double TAX_PCT_RANK_21 = .042;

    // Alabama, Georgia, Hawaii, New York, Wyoming
    private static final double TAX_PCT_RANK_22 = .04;

    // Colorado
    private static final double TAX_PCT_RANK_23 = .029;

    // Alaska, Delaware, Montana, New Hampshire, Oregon
    private static final double NO_TAX = 0;

    // Basic testing
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the State: ");
        String state = scan.nextLine();
        System.out.println("How much does the item cost?");
        double itemPrice = scan.nextDouble();


        if (state.equals("Alabama") || state.equals("Georgia")) {
            System.out.println("The item price is: " + (itemPrice + (itemPrice * TAX_PCT_RANK_22)) + " after tax");
        }


    }

}
