package staticAndFinal;

public class finalClass {
    public static void main(String[] args) {
        // abcde a = new abcde();

        ab a = new ab();
        a.method1();
    }
}

// final class cannot be extended

final class ab{
    public void method1(){
        System.out.println("ABCD");
    }
}

// class abcde extends ab{
    
// }