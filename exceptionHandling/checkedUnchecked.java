package exceptionHandling;

public class checkedUnchecked {
    public static void main(String[] args) {
        function_3();
    }
    public static void function_1(){
        // System.out.println(10/0);
        try {
            throw new lowBalanceException();
        } catch (lowBalanceException e) {
            System.out.println(e);
            e.getMessage();
            e.printStackTrace();
        }
    }
    public static void function_2(){
        function_1();
    }
    public static void function_3(){
        function_2();
    }
}
class lowBalanceException extends Exception{
    public String toString(){
        return "Balance should not be less than 5000";
    }
}