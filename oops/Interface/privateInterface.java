package oops.Interface;

public class privateInterface {
    public static void main(String[] args) {
        inter i = new inter();
        i.method_D();
    }
}
interface pri{
    private void method_P(){ 
        System.out.println("private method");
    }
    default void method_D(){
        method_P();
    }
    // methods which are public static can only have bodies
}

class inter implements pri{

}