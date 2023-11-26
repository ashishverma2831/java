package exceptionIO;
import java.io.*;;

public class pipedStream {
    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(                                                                                                   );

        pos.connect(pis);

        producer p = new producer(pos);
        consumer c = new consumer(pis);
        p.start();
        c.start();
    }
}
class producer extends Thread{
    OutputStream os;
    public producer(OutputStream o){
        os=o;
    }
    synchronized public void run(){
        int count=1;
        while(true){
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer "+count);
                System.out.flush();

                Thread.sleep(10);
                count++;
            } catch (Exception e) {

            }
        }
    }
}

class consumer extends Thread
{
    InputStream is;
    
    public consumer(InputStream s){
        is=s;
    }
    
    synchronized public void run(){
        int x;   
        while(true)
        {
            try{ 
            x=is.read(); 
            System.out.println("Consumer "+x);
            System.out.flush();
            Thread.sleep(10);

            }catch(Exception e){}
        }
    }
    
}