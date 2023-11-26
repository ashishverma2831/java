
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swingDemo {
    public static void main(String[] args) {
        swFRame sf= new swFRame();
        sf.setSize(500,500);
        sf.setVisible(true);
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class swFRame extends JFrame implements ActionListener{
    JLabel l;
    JButton b;

    int count=0;

    swFRame(){
        super("Swing Demo");

        l = new JLabel("CLicked "+count+" Times");
        b = new JButton("CLick");

        setLayout(new FlowLayout());
        add(l);
        add(b);

        b.addActionListener(this);
        getRootPane().setDefaultButton(b);
        // b.setIcon(new ImageIcon(""));
        // l.setToolTipText("ddd");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("CLicked "+count+" Times");
    }
}