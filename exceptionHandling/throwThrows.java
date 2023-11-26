package exceptionHandling;

public class throwThrows {
    public static void main(String[] args) {
        // try {
        //     // int a=10/0;
        //     // System.out.println(a);
        //     throw new negativeDimensionException();
        // } catch (negativeDimensionException e) {
        //     System.out.println(e.toString());
        // }

        try {
            method_12();
        } catch (negativeDimensionException e) {
            System.out.println(e);
        }
        System.out.println("Hi");

    }

    // because we didn't use try-catch block, functions must throws exception
    public static int area(int l,int b) throws negativeDimensionException{
        // return l*b;
        if(l<0 || b<0){
            throw new negativeDimensionException();
        }
        return l*b;
    }

    public static void method_12() throws negativeDimensionException{
        System.out.println("Area is "+area(10, 5));
    }
}

class negativeDimensionException extends Exception{
    public String toString(){
        return "Negative dimensions are not allowed.";
    }
}