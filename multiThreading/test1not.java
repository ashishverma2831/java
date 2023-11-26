package multiThreading;

public class test1not extends Thread {
    public static void main(String[] args) {
        test1not t = new test1not();
        t.start();
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
