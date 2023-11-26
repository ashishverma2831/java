
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.Border;

public class border {
    public static void main(String[] args) {
        bFrame bf = new bFrame();
        bf.setSize(500,500);
        bf.setVisible(true);
        bf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class bFrame extends JFrame{
    JLabel l;
    JButton b;
    JTextField tf;

    JPanel p;

    bFrame(){
        super("Border Component");

        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("Submit");
        p = new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

        // Border br = BorderFactory.createLoweredBevelBorder();
        // Border br = BorderFactory.createRaisedBevelBorder();
        // Border br = BorderFactory.createEtchedBorder();
        // Border br = BorderFactory.createLineBorder(Color.RED,5);
        // Border br = BorderFactory.createTitledBorder("Login");
        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red,2),"Login");

        p.setBorder(br);
        
        setLayout(new FlowLayout());
        add(p);
    }
}