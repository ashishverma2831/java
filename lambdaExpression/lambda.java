package lambdaExpression;

public class lambda {
    public static void main(String[] args) {
        myLambda m = ()->{
                System.out.println("Hello World");
            };
        m.display();
    }
}

@FunctionalInterface
interface myLambda{
    public void display();
}

// class mineM implements myLambda{
//     public void display(){
//         System.out.println("Hello World");
//     }
// }