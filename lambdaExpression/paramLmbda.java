package lambdaExpression;

public class paramLmbda {
    public static void main(String[] args) {
        // mineLambda m = (s)->{
        //     System.out.println(s);
        // };
        // m.display("Hello World");

        // mineLambda m = (a,b)->{return a+b;};
        mineLambda m = (a,b)->a+b;
        int n=m.add(20,30);
        System.out.println(n);
    }
}
@FunctionalInterface
interface mineLambda{
    // public void display(String s);
    public int add(int x,int y);
}