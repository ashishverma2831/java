package awtTutorial;

import java.awt.*;

public class frame {
    public static void main(String[] args) {
        Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout());

        Label l = new Label("Enter anything : ");
        TextField tf = new TextField(20); 
        Button b = new Button("Click Me");

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(400,400 );
        f.setVisible(true);
    }
}
