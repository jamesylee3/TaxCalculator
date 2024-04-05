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
    private static final double TAX_PCT_RANK_10 = .065;

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

        State alabama = new State("Alabama", "AL", .04);
        State alaska = new State("Alaska", "AK", 0);
        State arizona = new State("Arizona", "AZ", .056);
        State arkansas = new State("Arkansas", "AR", .065);
        State california = new State("California", "CA", .0725);
        State colorado = new State("Colorado", "CO", .029);
        State connecticut = new State("Connecticut", "CT", .0635);
        State delaware = new State("Delaware", "DE", 0);
        State florida = new State("Florida", "FL", .06);
        State georgia = new State("Georgia", "GA", .04);
        State hawaii = new State("Hawaii", "HI", .04);
        State idaho = new State("Idaho", "ID", .06);
        State illinois = new State("Illinois", "IL", .0625);
        State indiana = new State("Indiana", "IN", .07);
        State iowa = new State("Iowa", "IA", .06);
        State kansas = new State("Kansas", "KS", .065);
        State kentucky = new State("Kentucky", "KY", .065);
        State louisiana = new State("Louisiana", "LA", .0445);
        State maine = new State("Maine", "ME", .055);
        State maryland = new State("Maryland", "MD", .065);
        State massachusetts = new State("Massachusetts", "MA", .0625);
        State michigan = new State("Michigan", "MI", .065);
        State minnesota = new State("Minnesota", "MN", .06875);
        State mississippi = new State("Mississippi", "MS", .07);
        State missouri = new State("Missouri", "MO", .04225);
        State montana = new State("Montana", "MT", 0);
        State nebraska = new State("Nebraska", "NE", .055);
        State nevada = new State("Nevada", "NV", .0685);
        State newHampshire = new State("New Hampshire", "NH", 0);
        State newJersey = new State("New Jersey", "NJ", .06625);
        State newMexico = new State("New Mexico", "NM", .04875);
        State newYork = new State("New York", "NY", .04);
        State northCarolina = new State("North Carolina", "NC", .0475);
        State northDakota = new State("North Dakota", "ND", .05);
        State ohio = new State("Ohio", "OH", .0575);
        State oklahoma = new State("Oklahoma", "OK", .045);
        State oregon = new State("Oregon", "OR", 0);
        State pennsylvania = new State("Pennsylvania", "PA", .065);
        State rhodeIsland = new State("Rhode Island", "RI", .07);
        State southCarolina = new State("South Carolina", "SC", .065);
        State southDakota = new State("South Dakota", "SD", .042);
        State tennessee = new State("Tennessee", "TN", .07);
        State texas = new State("Texas", "TX", .0625);
        State utah = new State("Utah", "UT", .061);
        State vermont = new State("Vermont", "VT", .065);
        State virginia = new State("Virginia", "VA", .053);
        State washington = new State("Washington", "WA", .065);
        State westVirgina = new State("West Virginia", "WV", .065);
        State wisconsin = new State("Wisconsin", "WI", .05);
        State wyoming = new State("Wyoming", "WY", .04);

        GUI newGUI = new GUI();
    }

}
