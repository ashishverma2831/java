package multiThreading;

public class withoutSynchronisation {
    public static void main(String[] args) {
        data d = new data();
        thread1 t1 = new thread1(d);
        thread2 t2 = new thread2(d);
        t1.start();
        t2.start();
    }
}

class data {
    void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

class thread1 extends Thread {
    data d1;

    public thread1(data d) {
        d1 = d;
    }

    public void run() {
        d1.display("Hello World");
    }
}

class thread2 extends Thread {
    data d2;

    public thread2(data d) {
        d2 = d;
    }

    public void run() {
        d2.display("Welcome");
    }
}