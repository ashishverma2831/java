package arrays;

public class sortArray {
    public static void main(String[] args){
        String array[] = {"java","python","ruby","kotlin"};

        java.util.Arrays.sort(array);

        for(String x:array){
            System.out.println(x);
        }
    }
}
