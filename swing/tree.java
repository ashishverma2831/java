
import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree {
    public static void main(String[] args) {
        trFrame tf = new trFrame();
        tf.setSize(500,500);
        tf.setVisible(true);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class trFrame extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel label;
    
    trFrame()
    {
        super("Tree Demo");
        //valid path must be given
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\Users\\HP\\Desktop\\javaTutorial");
        File f=new File("C:\\Users\\HP\\Desktop\\javaTutorial");
        
        for(File x: f.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles())
                {
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        
        tree=new JTree(root);
        label=new JLabel("No Files Selected");
        
        tree.addTreeSelectionListener((TreeSelectionListener) this);
        JScrollPane sp=new JScrollPane(tree);
        
        add(sp,BorderLayout.CENTER);
        add(label,BorderLayout.SOUTH);
        
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }   
    
}





/*
JTree t;
    JLabel l;
    MyFrame()
    {
        
        DefaultMutableTreeNode drive=new DefaultMutableTreeNode("C:\\MyJava");
        //drive.add(new DefaultMutableTreeNode(new Button("Ok")));
        File f1=new File("C:\\MyJava");
        for(File x:f1.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles())
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                drive.add(temp);
            }
            else
                drive.add(new DefaultMutableTreeNode(x.getName())); 
        }
        t=new JTree(drive);
        JScrollPane jp=new JScrollPane(t);
        l=new JLabel("No Files Selected");
        
        
        t.addTreeSelectionListener(this);
        
        add(jp,BorderLayout.NORTH);
        add(l,BorderLayout.SOUTH);
        
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        TreePath tp=e.getPath();
        //DefaultMutableTreeNode tn=(DefaultMutableTreeNode)e.getSource();
        StringTokenizer sz=new StringTokenizer(tp.toString(),",]");
        String str="";
        while(sz.hasMoreTokens())
            str=sz.nextToken();
        l.setText(str);
        
        
    }
*/