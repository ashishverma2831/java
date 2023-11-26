package awtTutorial;

import java.awt.BorderLayout;
import java.awt.Button;
// import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class layouts {
    public static void main(String[] args) {
        layoutFrame lf=  new layoutFrame();
        lf.setSize(500,500);
        lf.setVisible(true);
    }
}

class layoutFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;

    layoutFrame(){
        super("Layout Demo");

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        // FlowLayout fl = new FlowLayout();
        // fl.setHgap(100);
        // fl.setAlignment(FlowLayout.RIGHT);
        // setLayout(fl);

        // add(b1);
        // add(b2);
        // add(b3);
        // add(b4);
        // add(b5);
        // add(b6);


        //Border Layout
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        

        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tues"));
        p.add(new Button("Wed"));

        add(p,BorderLayout.EAST);
        
    }
}