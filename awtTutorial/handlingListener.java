package awtTutorial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

public class handlingListener {
    public static void main(String[] args) {
        hFrame hf = new hFrame();
        hf.setSize(500, 500);
        hf.setVisible(true);
    }
}

class hFrame extends Frame implements ActionListener{
    TextField tf;
    Button b;
    int count=0;

    hFrame(){
        super("Handling Events");

        tf = new TextField("0");
        b = new Button("Click me");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
    }

}