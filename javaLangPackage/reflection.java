package javaLangPackage;

public class reflection {
    public static void main(String[] args) {
        // Class c = mine.class;

        
        // Field field[]=c.getDeclaredFields();
        
        // Method meth[]=c.getMethods();
        
        // for(Method m:meth)
        //     System.out.println(m);
        
        // Parameter param[]=meth[0].getParameters();
        
        // for(Parameter p:param)
        // {
        //     System.out.println(p);
        // }
    }
}

class mine
{
    // private int a;
    protected int b;
    public int c;
    int d;
    
    public mine() {}
    
    public mine(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}
