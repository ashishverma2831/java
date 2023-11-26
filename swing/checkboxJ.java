
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class checkboxJ {
    public static void main(String[] args) {
        cFrame cf = new cFrame();
        cf.setSize(500,500);
        cf.setVisible(true);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
// swing m Radiobutton h
// awt m radiobutton nhi th iske jagah checkboxgroup tha
class cFrame extends JFrame implements ActionListener{
    JTextField tf;
    JCheckBox c1,c2;
    JRadioButton r1,r2;

    cFrame(){
        super("Checkbox and Radiobutton Demo");

        // tf = new JTextField("Demo text", 20);
        tf = new JTextField(20);
        tf.setBounds(10,20,100,80);

        c1 =  new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);

        c2 =  new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        r1 = new JRadioButton("Lower");
        r2 = new JRadioButton("Upper");
        ButtonGroup bg=new ButtonGroup(); // for grouping the buttons together
        bg.add(r1);
        bg.add(r2);
        // adding to button group

        add(r1);
        add(r2);
        add(tf);
        add(c1);
        add(c2);
        
        setLayout(new FlowLayout());
        // setting layout as null so that we can position components manually
 
        r1.addActionListener(this);
        r2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Lower": tf.setText(tf.getText().toLowerCase());
                            break;
            case "Upper": tf.setText(tf.getText().toUpperCase());
                            break;
        }

        int i=0,b=0;
        if(c1.isSelected())
            b =Font.BOLD;
        if(c2.isSelected())
            i =Font.ITALIC;

        Font f = new Font("Times New Roman",b|i,15);
        tf.setFont(f);
    }
}