package oops.Interface;

public class interfacePractice {
    public static void main(String[] args) {
        System.out.println(test.x);
        test.method3();
    }
}

interface test{
    final static int x=20;
    public abstract void method1();
    abstract public void method2();
    public static void method3(){
        System.out.println("Method 3");
    }
    // public methods are not allowed but public static method are allowed to have method body
}
interface test_1 extends test{
    void method4();
}

class My implements test_1{
    public void method1(){ System.out.println("Method 1");}
    public void method2(){ System.out.println("Methid 2");}
    public void method4(){ System.out.println("Method 4");}
}