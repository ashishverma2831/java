package exceptionHandling;

public class arrayException {
    public static void main(String[] args) {
        int array[] = {30,20,10,50,0};

        // System.out.println(array[0]/array[2]);
        // System.out.println(array[4]);

        try {
            int a = array[3]/array[2];
            System.out.println("Division is "+a);
            try {
                System.out.println("Sixth element of the array is "+array[5]);
            } catch (Exception e) {
                System.out.println("Index is Invalid");
            }
        } catch (Exception e) {
            System.out.println("Denominator should not be zero");
        }
        System.out.println("Goodluck");
    }
}
