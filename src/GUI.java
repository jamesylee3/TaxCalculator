import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI {

    JTextField purchaseAmtField;
    JButton button;
    JFrame frame = new JFrame("Tax Calculator");
    JLabel title = new JLabel("Tax Calculator");

    GUI() {
        // Top Text
        title.setHorizontalAlignment(JLabel.CENTER);
//        title.setBounds(250,50,300,50);


        // Frame
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(title);
    }
}
