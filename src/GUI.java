import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JTextField purchaseAmtField;
    JButton calculateButton;
    JButton[] keyButtons = new JButton[11];
    JPanel keyPanel = new JPanel();
    JFrame frame = new JFrame("Tax Calculator");
    JLabel title = new JLabel("Tax Calculator");
    JLabel purchaseLabel = new JLabel("Purchase Amount: ");
    JLabel stateLabel = new JLabel("Select Your State: ");
    JLabel resultLabel = new JLabel("Your Item Will Cost: ");
    JTextField purchaseTF = new JTextField();
    JTextField resultTF = new JTextField();
    JComboBox stateBox;


    // Create States
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

    // States Array
    State[] statesArray = {alaska,alabama,arizona,arkansas,california,colorado,connecticut,delaware,florida,georgia,
            hawaii,idaho,illinois,indiana,iowa,kansas,kentucky,louisiana,maine,maryland,massachusetts,michigan,minnesota,
            mississippi,missouri,montana,nebraska,nevada,newHampshire,newJersey,newMexico,newYork,northCarolina,northDakota,
            ohio,oklahoma,oregon,pennsylvania,rhodeIsland,southCarolina,southDakota,tennessee,texas,utah,vermont,virginia,
            washington,westVirgina,wisconsin,wyoming};


    GUI() {

        // Title Text
        title.setFont(new Font("MV Boli",Font.BOLD,30));
        JPanel textPan = new JPanel();
        textPan.setBounds(225,40,300,80);
        textPan.add(title);

        // Purchase Amount Text
        purchaseLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        JPanel purPan = new JPanel();
        purPan.setBounds(100,120,200,50);
        purPan.add(purchaseLabel);

        // State Text
        stateLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        JPanel stateTextPan = new JPanel();
        stateTextPan.setBounds(100, 205, 200,50);
        stateTextPan.add(stateLabel);

        // Result Text
        resultLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        JPanel resultPan = new JPanel();
        resultPan.setBounds(64, 565, 250,50);
        resultPan.add(resultLabel);

        // TextFields
        purchaseTF.setBounds(350,130,300,30);
        purchaseTF.setEditable(true);
        resultTF.setBounds(350,570,300,30);
        resultTF.setEditable(false);

        // Keypad Buttons
        for (int i = 0; i <= 9; i++) {
            keyButtons[i] = new JButton(String.valueOf(i));
            keyButtons[i].addActionListener(this);
            keyButtons[i].setFocusable(false);
        }
        keyButtons[10] = new JButton(".");
        keyButtons[10].addActionListener(this);
        keyButtons[10].setFocusable(false);

        keyPanel.setBounds(185,270,400,200);
        keyPanel.setLayout(new GridLayout(4,4,5,5));
//        keyPanel.setBackground(Color.gray);
        keyPanel.add(keyButtons[0]);
        keyPanel.add(keyButtons[1]);
        keyPanel.add(keyButtons[2]);
        keyPanel.add(keyButtons[3]);
        keyPanel.add(keyButtons[4]);
        keyPanel.add(keyButtons[5]);
        keyPanel.add(keyButtons[6]);
        keyPanel.add(keyButtons[7]);
        keyPanel.add(keyButtons[8]);
        keyPanel.add(keyButtons[9]);
        keyPanel.add(keyButtons[10]);




        // Calculate Button
        calculateButton = new JButton();
        calculateButton.setBounds(220,480,330,60);
        calculateButton.setText("CALCULATE");
        calculateButton.setFont(new Font("MV Boli",Font.BOLD,24));
        calculateButton.setFocusable(false);

        // ComboBox
        stateBox = new JComboBox(statesArray);
        JPanel comboBoxPan = new JPanel();
        comboBoxPan.setBounds(257,210,300,30);
        comboBoxPan.add(stateBox);

        // Frame
        frame.setLayout(null);
        frame.setSize(750,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(textPan);
        frame.add(purPan);
        frame.add(stateTextPan);
        frame.add(resultPan);
        frame.add(purchaseTF);
        frame.add(resultTF);
        frame.add(comboBoxPan);
        frame.add(calculateButton);
        frame.add(keyPanel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
