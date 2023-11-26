package awtTutorial;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

public class keyEvent {
    public static void main(String[] args) {
        kFrame kf = new kFrame();
        kf.setSize(500,500);
        kf.setVisible(true);
    }
}

class kFrame extends Frame implements KeyListener{
    Label l1,l2,l3,l4;

    kFrame(){
        super("Key Events");

        l1= new Label("");
        l2= new Label("");
        l3= new Label("");
        l4= new Label("");

        setLayout(null);

        l1.setBounds(30,40, 100, 20);
        l2.setBounds(30,70, 100, 20);
        l3.setBounds(30,100, 100, 20);
        l4.setBounds(30,130, 200, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l3.setText("Key Typed");
        l4.setText(new Date(e.getWhen()) + "");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
        l2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
}

// there are 3 types of key events 
// key pressed
// key hold == key typed
// key released