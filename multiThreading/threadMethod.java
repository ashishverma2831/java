package multiThreading;

public class threadMethod {
    public static void main(String[] args) throws Exception {
        // mineThread th = new mineThread("My Name");
        // System.out.println(th.getName());
        // System.out.println(th.getClass());
        // System.out.println(th.getPriority());
        // System.out.println(th.getState());
        // System.out.println(th.isAlive());

        // mineThread th = new mineThread("af");
        // th.start();
        // th.interrupt();

        // mineThread th = new mineThread("afaa");
        // th.setDaemon(true);
        // th.start();
        // Thread mainThread = Thread.currentThread();
        // mainThread.join();

        mineThread th = new mineThread("sbfm");
        th.start();
        int count = 1;
        while (true) {
            System.out.println(count++ + "nfksamfkasmas");
            Thread.yield();
        }
    }
}

class mineThread extends Thread {
    public mineThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY - 2);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count + "asfmksmfksfkaskfmsakfkasfkask");
            count++;
            try {
                Thread.sleep(1000);
            } catch (Exception e)
            // Interrupted Exception
            {
                System.out.println(e);
            }
        }
    }
}