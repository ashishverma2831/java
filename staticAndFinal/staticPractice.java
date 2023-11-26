package staticAndFinal;

public class staticPractice {
    public static void main(String[] args) {
        test t = new test();
        t.show();
        // t.x=2;
        t.y=6;   
        test t_ = new test();
        t_.show();
        t.show();
    }
}

class test{
    static int x=20;
    int y=30;

    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
        System.out.println("The value of x is "+x);    }
}