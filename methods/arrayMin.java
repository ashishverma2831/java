package methods;

public class arrayMin {
    public static void main(String[] args) {
        int arr[] = {12,34,25,67,98,96};
        int minimum = minArray(arr);
        System.out.println("Minimum of the given array is "+minimum);
    }

    static int minArray(int array[]){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
