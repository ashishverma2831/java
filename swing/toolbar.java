import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class toolbar {
    public static void main(String[] args) {
        toolFrame tf = new toolFrame();
        tf.setSize(600, 600);
        tf.setVisible(true);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class toolFrame extends JFrame implements ActionListener{
    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6;
    JTextArea ta;

    toolFrame(){
        super("Toolbar demo");
        tb = new JToolBar();

        b1 = new JButton("A");
        b2 = new JButton("B");
        b3 = new JButton("C");
        b4 = new JButton("D");
        b5 = new JButton("E");
        b6 = new JButton("F");

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);

        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem m1 = new JMenuItem("save");
        JMenuItem m2 = new JMenuItem("open");
        m1.setMnemonic(KeyEvent.VK_O);

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        b2.setActionCommand("open");
        b2.addActionListener((ActionListener) this); 
        m2.addActionListener((ActionListener)this);
        b1.addActionListener((ActionListener) this);
        m1.addActionListener((ActionListener)this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("open"))
        {    
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        File f=fc.getSelectedFile();
        
        try{
            FileInputStream fi=new FileInputStream(f);
            byte b[]=new byte[fi.available()];
            fi.read(b);
            String str=new String(b);
            ta.setText(str);
            fi.close();
            
        }
        catch(Exception e){}
        }
        else
        {
            Color col=JColorChooser.showDialog(this, "Font Color", Color.red);
            ta.setForeground(col);
        }
    }
}