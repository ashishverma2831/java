package arrays;

public class differenceMaxMin {
    public static void main(String[] args) {
        int arr[] = {12,34,55,67,87,29,78};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("\nThe difference between the maximun and the minimum of the given array is "+diff);
    }
}
