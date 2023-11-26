package packageP;
// import packageP.demo_1;
// import packageP.demo_2;

// import packageP.*;
// import methods.prime;
// import programs.demo_4;

public class demo_3 extends demo_2{
    public static void main(String[] args) {
        // demo_1 d1 = new demo_1();
        demo_1 d1 = new demo_1();
        d1.display();

        demo_2 d2 = new demo_2();
        d2.display();
        d2.displayP();

        demo_3 d3 = new demo_3();
        d3.display();
        d3.displayP();
        d3.displayP3();

    }

    public void displayP3(){
        System.out.println("Demo 3 is here");
    }

    // prime p = new prime();
    // p.showNumber();

}
