package oops.Interface;

public class phoneInterface {
    public static void main(String[] args) {
        IMusicPlayer sp = new smartPhone();
        sp.play();
        sp.pause();
    }
}
class phone{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sending SMS");
    }
}
interface Icamera{
    void click();
    void record();
}
interface IMusicPlayer{
    void play();
    void pause();
}
class smartPhone extends phone implements IMusicPlayer,Icamera{
    public void videoCall(){ System.out.println("Smart phone video calling");}

    public void click(){ System.out.println("Smart phone clicked");}
    public void record(){ System.out.println("Smart phone record");}
    public void play(){ System.out.println("Smart phone playing");}
    public void pause(){ System.out.println("Smart phone stopped");}
}