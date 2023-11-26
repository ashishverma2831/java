package multiThreading;

public class test2not implements Runnable {
    public static void main(String[] args) {
        test2not t = new test2not();
        Thread t2 = new Thread(t);
        t2.start();
        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
