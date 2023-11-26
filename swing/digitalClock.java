// import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JPanel;

public class digitalClock {
    public static void main(String[] args) {
        dClock clock = new dClock();
        clock.setVisible(true);
        // clock.setSize(350, 200);
        // clock.setResizable(false);
        // clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class dClock extends JFrame{

    // Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    String day;

    dClock(){
        super("Digital Clock");
        setSize(550, 170);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.black);
        setLayout(new FlowLayout());

        timeFormat = new SimpleDateFormat(" hh:mm:ss a ");
        timeLabel = new JLabel();
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setOpaque(true);
        // timeLabel.setBounds(100,100, 100, 100);
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        dayFormat = new SimpleDateFormat(" EEEE dd MMMM yyyy ");
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana", Font.PLAIN, 40));
        dayLabel.setBackground(Color.BLACK);
        dayLabel.setOpaque(true);
        dayLabel.setForeground(Color.red);

        // JPanel p = new JPanel();
        // add(p);
        // p.setLayout(new BorderLayout());
        // p.add(timeLabel);
        // p.add(dayLabel);
        // p.setBackground(Color.black);

        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);
        setTime();
    }

    public void setTime() {
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    } 
}