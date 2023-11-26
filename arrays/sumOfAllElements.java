package arrays;

public class sumOfAllElements {
    public static void main(String[] args){
        int array[] = {23,45,12,78,94};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        System.out.println("The sum of the elements of the array is "+sum);
    }
}
