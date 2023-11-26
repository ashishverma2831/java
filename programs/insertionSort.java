public class insertionSort {
    public static void main(String[] args){
        int array[] = {7,9,2,5,25,76,34,23,1};
        System.out.println("Array before sorting.");
        for(int k=0;k<array.length;k++){
            System.out.printf("%4d",array[k]);
        }
        for(int j=1;j<array.length;j++){
            int key = array[j];
            int i=j-1;
            while(i>-1 && array[i]>key){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
        System.out.println("\n Array after sorting.");
        for(int k=0;k<array.length;k++){
            System.out.printf("%4d",array[k]);
        }
    }
}
