package oops.Abstract;

public class abstractClass {
    public static void main(String[] args) {
        // superC sc;
        // sc.superC();
        superC sc = new sub();
        sc.method1();
        sc.method2();
    }
}

abstract class superC{
    public superC(){
        System.out.println("Super class constructor");
    }
    public void method1(){
        System.out.println("Hello super");
    }
    abstract public void method2();
}
class sub extends superC{
    public sub(){
        System.out.println("Sub class constructor");
    }
    @Override
    public void method2(){
        System.out.println("Hello this is method 2");
    }
}