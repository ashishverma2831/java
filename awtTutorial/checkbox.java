package awtTutorial;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class checkbox {
    public static void main(String[] args) {
        mineFrame f = new mineFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}

class mineFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    //radiobuttons
    CheckboxGroup cbg;

    public mineFrame(){
        super("Checkbox Demo");
        l = new Label("Nothing is Selected ");

        // c1 = new Checkbox("Java");
        // c2 = new Checkbox("Python");
        // c3 = new Checkbox("C#");

        cbg = new CheckboxGroup();

        c1 = new Checkbox("Java",false,cbg);
        c2 = new Checkbox("Python",false,cbg);
        c3 = new Checkbox("C#",false,cbg);
        // true - already checked

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";

        if(c1.getState())
                str = str+" "+c1.getLabel();
        if(c2.getState())
                str = str+" "+c2.getLabel();
        if(c3.getState())
                str = str+" "+c3.getLabel();

        l.setText(str);
    }
}