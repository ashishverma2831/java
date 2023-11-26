package multiThreading;

public class withSynchronisation {
    public static void main(String[] args) {
        dataD d = new dataD();
        thread11 t1 = new thread11(d);
        thread22 t2 = new thread22(d);
        t1.start();
        t2.start();
    }
}

class dataD {
    // void display(String str) {
    // for (int i = 0; i < str.length(); i++) {
    // System.out.println(str.charAt(i));
    // }
    // }

    // void display(String str) {
    // synchronized (this) {
    // for (int i = 0; i < str.length(); i++) {
    // System.out.println(str.charAt(i));
    // }
    // }
    // }

    synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

}

class thread11 extends Thread {
    dataD d1;

    public thread11(dataD d) {
        d1 = d;
    }

    public void run() {
        d1.display("Hello World");
    }
}

class thread22 extends Thread {
    dataD d2;

    public thread22(dataD d) {
        d2 = d;
    }

    public void run() {
        d2.display("  Welcome");
    }
}