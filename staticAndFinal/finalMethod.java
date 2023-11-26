package staticAndFinal;

public class finalMethod {
    public static void main(String[] args) {
        // final methods cannot be overridden
        abcd a = new abcd();
        a.Hello();
    }
}

class abc{
    final public void Hello(){
        System.out.println("Hello");
    }
    public final void hello(){
        System.out.println("yup");
    }
    // final can be written both before and after public 
}
class abcd extends abc{
    // public void Hello(){
    //     System.out.println("Hello World");
    // } 
}