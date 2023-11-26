package arrays;

public class increasingSizeOfArray {
    public static void main(String[] args){
        int arrayA[] = {12,34,54,71,23};
        int arrayB[] = new int[2*arrayA.length];
        for(int x:arrayA){
            System.out.printf("%3d",x);
        }
        System.out.println("\nsize of array A is :"+arrayA.length);
        System.out.println();
        for(int y:arrayB){
            System.out.printf("%3d",y);
        }
        System.out.println("\nsize of array B is :"+arrayB.length);
        
        for(int i=0;i<arrayA.length;i++){
            arrayB[i] = arrayA[i];
        }

        for(int y:arrayB){
            System.out.printf("%3d",y);
        }

        arrayA = arrayB;
        arrayB = null;

        System.out.println("\narray A in it's increased size ");
        for(int x:arrayA){
            System.out.printf("%3d",x);
        }
        System.out.println("\nnew size of array A is :"+arrayA.length);
    }
}
