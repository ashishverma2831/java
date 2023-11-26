package multiThreading;

public class interProcess {
    public static void main(String[] args) {
        myData data = new myData();
        producer p=new producer(data);
        consumer c=new consumer(data);
        p.start();
        c.start();;
    }
}

// producer-consumer problem

class myData{
    int value;
    boolean flag=true;

    synchronized public void set(int v){
        while(flag!=true){
            try {
                wait(1000);
            } catch (Exception e) {
            }
        }
        value=v;
        flag=false;
        notify();
    }
    synchronized public int get(){
        int x=0;
        while(flag!=false){
            try {
                wait(1000);
            } catch (Exception e) {
            }
        }
        x=value;
        flag=true;
        notify();

        return x;
    }
}

class producer extends Thread{
    myData data;
    public producer(myData d){
        data=d;
    }
    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class consumer extends Thread
{
    myData data;
    public consumer(myData d){
        data=d;
    }
    public void run(){
        int value;
        while(true){
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}