package awtTutorial;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonActionListener {
    public static void main(String[] args) {
        myFrame f = new myFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}

class myFrame extends Frame implements ActionListener{
    int count=0;
    Label l;
    Button b;

    public myFrame(){
        super("Button Demo");

        l = new Label("    "+count);
        b = new Button("Click Me");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("    "+count);
    }
}


