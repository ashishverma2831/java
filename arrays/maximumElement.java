package arrays;

public class maximumElement {
    public static void main(String[] args){
        int array[] = {34,56,12,67,99,23};
        int max = array[0];
        int max2 = array[0];
        // for(int i=0;i<array.length;i++){
        //     if(array[i]>max){
        //         max = array[i];
        //     }
        // }
        // System.out.println("Maximum element of the given array is "+max);
        
    // second largest element
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max2 = max;
                max = array[i];
            }
            else if(array[i]>max2){
                max2 = array[i];
            }
        }
        System.out.println("Maximum element of the given array is "+max);
        System.out.println("Second Largest element of the given array is "+max2);
    }
}
