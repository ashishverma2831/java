package arrays;

public class forEach {
    public static void main(String[] args){
        int arr[] = {23,24,56,88,67,99};

        for(int i=0;i<arr.length;i++){
            System.out.printf("%3d",arr[i]);
        }
        System.out.println();
        // reverse printing of an array
        for(int i=arr.length-1;i>=0;i--){
            System.out.printf("%3d",arr[i]);
        }
        System.out.println();
        // for each loop
        for(int x : arr){
            System.out.printf("%3d",x);
        }
    }
}
