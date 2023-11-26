package arrays;

public class copyingAnArray {
    public static void main(String[] args){
        int arrayA[] = {1,2,3,4,5,6,7,8,14,28};
        int arrayB[] = new int[10];
        System.out.println("Arrays before copying");
        System.out.println("Array A :");
        for(int x:arrayA){
            System.out.printf("%3d",x);
        }
        System.out.println("\nArray B :");
        for(int x:arrayB){
            System.out.printf("%3d",x);
        }
        System.out.println("\nArrays after copying");
        for(int i=0;i<arrayA.length;i++){
            arrayB[i] = arrayA[i];
        }
        System.out.println("Array A :");
        for(int x:arrayA){
            System.out.printf("%3d",x);
        }
        System.out.println("\nArray B :");
        for(int x:arrayB){
            System.out.printf("%3d",x);
        }

        //reverse copying of an array
        System.out.println("\nArrays after reverse copying the elements");
        for(int m=arrayA.length-1,n=0;m>=0;m--,n++){
            arrayB[n] = arrayA[m];
        }

        System.out.println("Array A :");
        for(int x:arrayA){
            System.out.printf("%3d",x);
        }
        System.out.println("\nArray B :");
        for(int x:arrayB){
            System.out.printf("%3d",x);
        }
    } 
}