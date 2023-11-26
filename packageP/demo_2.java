package packageP;

public class demo_2 extends demo_1{
    public static void main(String[] args) {
        demo_1 d = new demo_2();
        d.display();

        demo_2 dc = new demo_2();
        dc.display();
        dc.displayP();   
    }

    public void displayP(){
        System.out.println("Demo 2 is here");
    }
}
