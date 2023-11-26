package exceptionHandling;

public class finallyBlock {
    public static void main(String[] args) {
        try {
            // int a = 10/0;
            // System.out.println(a+1);

            method_15();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Hii");
        }
    }

    static void method_15() throws Exception{
        try{
            throw new aeyyException();
        }
        finally{
            System.out.println("Yup!!!");
        }
    }
}

class aeyyException extends Exception{
    public String toString(){
        return "Sab ho jayega bhaiya, thoda sabar to rkh mere yrr...";
    }
}