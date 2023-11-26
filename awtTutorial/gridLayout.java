package awtTutorial;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
// import java.awt.GridLayout;

public class gridLayout {
    public static void main(String[] args) {
        gLayout g = new gLayout();
        g.setSize(400,400);
        g.setVisible(true);
    }
}

class gLayout extends Frame{
    Button b1,b2,b3,b4,b5,b6;

    public gLayout(){
        // super("Grid Layout Demo");
        super("Grid-bag Layout");
        // setLayout(new GridLayout(3,2));

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        // add(b1);
        // add(b2);
        // add(b3);
        // add(b4);
        // add(b5);
        // add(b6);


        // gridbag Layout
        
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gdc = new GridBagConstraints();

        setLayout(gb);
        
        gdc.gridx = 1;
        gdc.gridy = 1;
        add(b1,gdc);

        gdc.gridx = 1;
        gdc.gridy = 3;
        add(b2,gdc);

        gdc.gridx = 2;
        gdc.gridy = 2;
        add(b3,gdc);

        gdc.gridx = 3;
        gdc.gridy = 1;
        add(b4,gdc);

        gdc.gridx = 3;
        gdc.gridy = 3;
        add(b5,gdc);
        
    }
}