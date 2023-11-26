package awtTutorial;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class text {
    public static void main(String[] args) {
        mFrame m = new mFrame();
        m.setSize(350, 400);
        m.setVisible(true);
    }
}

class mFrame extends Frame implements TextListener,ActionListener{
    Label l1,l2;
    TextField tf;

    mFrame(){
        super("Text-field Demo");

        l1=new Label("No Text");
        l2=new Label("Enter key is not yet hit");
        tf=new TextField(20);
        tf.setEchoChar('*');

        tf.addActionListener(this);
        tf.addTextListener(this);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }
}