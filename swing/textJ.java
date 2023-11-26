
import java.awt.*;
import java.text.*;
import java.util.Date;
import java.util.Locale;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

public class textJ {
    public static void main(String[] args) {
        tFrame tf = new tFrame();
        tf.setSize(500,500);
        tf.setVisible(true);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class tFrame extends JFrame{
    tFrame(){
        JTextField t1 = new JTextField(20);
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField t2 = new JFormattedTextField(df);
        // column dekar width btao formatted text field ki
        // value doge tbhi show hogi date
        t2.setColumns(20);
        t2.setValue(new Date());

        // NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        // number k alawa kuch bhi add kroge to nhi krega add
        // nft.setMaximum(1000);
        JFormattedTextField t3 = new JFormattedTextField(nft);
        t3.setColumns(20);
        t3.setValue(0);

        // JTextArea ta = new JTextArea(30,30);
        setLayout(new FlowLayout());
        add(t1);
        add(t2);
        add(t3);
    }
}