package methods;

public class prime {
    public static void main(String[] args) {
        // int number = 2;
        // boolean isPrime = checkPrime(number);
        // System.out.println(isPrime);

        for(int i=2;i<100;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean checkPrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;  
        }
        return true;
    }

    // public void showNumber(){
    //     System.out.println("Hello number");
    // }
}
