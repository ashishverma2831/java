package packageP;

public class accessModifier {
    public static void main(String[] args) {
        demo d = new demo();
        d.display();

    }
}

class demo{
    int a=2; //default
    public int b=4;
    private int c=7;
    protected int d=8;

    public void display(){
        System.out.println(a+b+c+d);
    }
}



// default can be accessed inside same package
// public everywhere
// private only same class else not
// protected everywhere but not in different package and non sub class
