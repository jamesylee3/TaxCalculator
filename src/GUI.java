import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI {

    JTextField purchaseAmtField;
    JButton button;
    JFrame frame = new JFrame("Tax Calculator");
    JLabel title = new JLabel("Tax Calculator");
    JLabel purchaseLabel = new JLabel("Purchase Amount: ");
    JLabel stateLabel = new JLabel("Select Your State: ");
    JLabel resultLabel = new JLabel("Your Item Will Cost: ");
    JTextField purchaseTF = new JTextField();
    JTextField resultTF = new JTextField();
    JComboBox stateBox;
    String[] testStateBox = {"Alaska", "Alabama", "Arkansas"};


    GUI() {

        // Title Text
        title.setFont(new Font("MV Boli",Font.BOLD,30));
        JPanel textPan = new JPanel();
        textPan.setBounds(225,40,300,100);
        textPan.add(title);

        // Purchase Amount Text
        purchaseLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        JPanel purPan = new JPanel();
        purPan.setBounds(100,200,200,50);
        purPan.add(purchaseLabel);

        // State Text
        stateLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        JPanel stateTextPan = new JPanel();
        stateTextPan.setBounds(100, 275, 200,50);
        stateTextPan.add(stateLabel);

        // Result Text
        resultLabel.setFont(new Font("MV Boli",Font.BOLD,20));
        JPanel resultPan = new JPanel();
        resultPan.setBounds(64, 495, 250,50);
        resultPan.add(resultLabel);

        // TextFields
        purchaseTF.setBounds(350,205,300,30);
        resultTF.setBounds(350,500,300,30);
        purchaseTF.setEditable(false);
        resultTF.setEditable(false);

        // ComboBox
        stateBox = new JComboBox(testStateBox);
        JPanel comboBoxPan = new JPanel();
        comboBoxPan.setBounds(350,300,300,30);
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
        frame.setVisible(true);

    }
}
