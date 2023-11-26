package awtTutorial;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class animation {
    public static void main(String[] args) {
        aniFrame af = new aniFrame();
        af.setSize(500, 400);
        af.setVisible(true);
    }
}

class aniFrame extends Frame implements Runnable{
    int x,y,tx,ty;

    aniFrame(){
        x=100;
        y=100;
        tx=ty=1;

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g){
        g.fillOval(x,y, 50,50);
        g.setColor(Color.black);
    }

    @Override
    public void run() {
        while(true){
            x+=tx;
            y+=ty;

            if(x<0 || x>450){
                tx = tx * -1;
            }
            if(y<20 || y>350){
                ty = ty * -1;
            }
            repaint();

            try {
                Thread.sleep(5);
            } catch (Exception e) {
                
            }
        }
    }
}