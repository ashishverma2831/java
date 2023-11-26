package arrays;

public class rotationOfArray {
    public static void main(String[] args){
        int array[] = {23,56,67,34,99};
        int array2[] = {23,56,67,34,99};

        int lengthArray = array.length;
        System.out.println("The length of the given array is "+lengthArray);

        for(int x:array){
            System.out.printf("%3d",x);
        }
        System.out.println();
        // left rotation
        int temp = array[0];
        for(int i=1;i<array.length;i++){
            array[i-1] = array[i];
        }   
        array[array.length-1] = temp;
        System.out.println("The array after left rotation :");
        for(int x:array){
            System.out.printf("%3d",x);
        }

        // right rotation
            int temp2 = array2[array2.length-1];
            for(int i=array2.length-1;i>0;i--){
                array2[i] = array2[i-1];
            }
            array2[0] = temp2;
            System.out.println("\nThe array after right rotation :");
            for(int x:array2){
                System.out.printf("%3d",x);
            }
    }
}
