package arrays;

public class mergingArrays {
    public static void main(String[] args){
        int array_1[] = {1,2,3,4,5};
        int array_2[] = {6,7,8,9,10};
        int size = array_1.length + array_2.length;
        int array_12[] = new int[size];

        for(int i=0;i<array_1.length;i++){
            array_12[i] = array_1[i];
        }
        for(int j=array_1.length,k=0;j<array_12.length;j++,k++){
            array_12[j] = array_2[k];
        }

        for(int x:array_12){
            System.out.printf("%3d",x);
        }
    }
}
