
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class layeredPane {
    public static void main(String[] args) {
        lFrame lf = new lFrame();
        lf.setSize(800,800);
        lf.setVisible(true);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class lFrame extends JFrame implements ActionListener{
    JLayeredPane lp;
    JRadioButton r1,r2,r3;
    JLabel l1,l2,l3,l4;

    lFrame(){
        super("Layered Demo");

        r1 = new JRadioButton("RED");
        r2 = new JRadioButton("GREEN");
        r3 = new JRadioButton("BLUE",true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);bg.add(r3);

        r1.addActionListener(this);
        r1.addActionListener(this);
        r1.addActionListener(this);

        JPanel p = new JPanel();
        p.add(r1);
        p.add(r2);
        p.add(r3);

        l1 = new JLabel("Red");
        l1.setBounds(10, 10, 200, 200);
        l1.setBackground(Color.red);
        l1.setOpaque(true);

        l2=new JLabel("Green");
        l2.setBounds(50,50,250,250);
        l2.setBackground(Color.green);
        l2.setOpaque(true);
        
        l3=new JLabel("Blue");
        l3.setBounds(70,70,300,300);
        l3.setBackground(Color.blue);
        l3.setOpaque(true);
        
        l4=new JLabel("b");
        l4.setBounds(100,100,150,150);
        l4.setBackground(Color.black);
        l4.setOpaque(true);


        lp=new JLayeredPane();
        // lp.add(l1,new Integer(0));
        // lp.add(l2,new Integer(1));
        // lp.add(l3,new Integer(2));
        // lp.add(l4,new Integer(3));
        lp.add(l1,0);
        lp.add(l2,1);
        lp.add(l3,2);
        lp.add(l4,3);

        add(p,BorderLayout.NORTH);
        add(lp,BorderLayout.CENTER);
        
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me)
            {
                l4.setLocation(me.getX(), me.getY());
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(r1.isSelected())
            lp.setLayer(l4, 1);
        if(r2.isSelected())
            lp.setLayer(l4, 2);
        if(r3.isSelected())
            lp.setLayer(l4, 3);
    }
}