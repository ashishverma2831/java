package awtTutorial;

import java.awt.*;
import java.awt.event.*;

class mhFrame extends Frame implements MouseListener, MouseMotionListener
{
    Label l,l2;
    
    mhFrame()
    {
        super("Mouse Event Demo");
        
        l=new Label("");
        l2=new Label("");
        
        setLayout(null);
        
        l.setBounds(10,50,100,20);
        l2.setBounds(10,80,100,20);
        add(l);
        add(l2);
        
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void mouseClicked(MouseEvent e) 
    {
        l.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) 
    {
        l.setText("Mouse Pressed");

    }

    public void mouseReleased(MouseEvent e) 
    {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) 
    {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) 
    {
        l.setText("Mouse Exited");
    }

    
    public void mouseDragged(MouseEvent e) 
    {
        l.setText("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent e) 
    {
        l.setText("Mouse Move");
        l2.setText("("+e.getX()+","+e.getY()+")");
    }

}


public class mouseHandle 
{

    public static void main(String[] args) 
    {
        mhFrame f=new mhFrame();
        f.setSize(500,500);
        f.setVisible(true);
        
    }
    
}