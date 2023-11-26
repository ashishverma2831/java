package awtTutorial;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window {
    public static void main(String[] args) {
        wFrame wf = new wFrame();
        wf.setSize(500,500);
        wf.setVisible(true);
    }
}

class wFrame extends Frame implements WindowListener{

    Label l;

    wFrame(){
        super("Window Listener Demo");

        l= new Label("No message from window");
        setLayout(new FlowLayout());
        add(l);
        addWindowListener(this);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }

}