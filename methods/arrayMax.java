package methods;

public class arrayMax {
    public static void main(String[] args) {
        int arr[] = {12,34,25,67,98,96};
        int maximum = maxArray(arr);
        System.out.println("Maximum of the given array is "+maximum);
    }
    static int maxArray(int array[]){
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    // using varags
    // static int maxArray(int ...x){
    //     int max = x[0];
    //     for(int i=0;i<x.length;i++){
    //         if(x[i]>max){
    //             max = x[i];
    //         }
    //     }
    //     return max;
    // }
}
