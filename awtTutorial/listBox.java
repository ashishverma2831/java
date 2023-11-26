package awtTutorial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class listBox {
    public static void main(String[] args) {
        m1Frame mf = new m1Frame();
        mf.setSize(300, 250);
        mf.setVisible(true);
    }
}

class m1Frame extends Frame implements ItemListener,ActionListener{
    List l;//selects multiple
    Choice c;//selects single option
    TextArea ta;

    m1Frame(){
        super("List-Box");

        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("february");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==l){
            ta.setText(l.getSelectedItem());
        }
        else{
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[] = l.getSelectedItems();

        String str = "";
        for (String x : list) {
            str += x+"\n";
        }

        ta.setText(str);
    }
}