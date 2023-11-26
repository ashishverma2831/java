package sorting;

public class counting {
    public static void main(String[] args) {
        int arr[] = {4,0,2,0,1,3,5,4,1,3,2,3};
        int max=0;
        System.out.println("The unsorted array is : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){ 
                max=arr[i];
            }
        }
        System.out.println("\nMaximum element in the array is : "+max);
        int size = max+1;
        int arrCount[] = new int[size];
        for(int i=0;i<size;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){ 
                if(i==arr[j]){
                    count++;
                }
            }
            arrCount[i] = count;
        }
        System.out.println("The counting array : ");
        for (int i : arrCount) {
            System.out.print(i+" ");
        }
        
        int i=0,j=0;
        while(i<size){
            if(arrCount[i]>0){
                arr[j]=i;
                arrCount[i]=arrCount[i]-1;
                j++;
            }
            else{
                i++;
            }

        }
        System.out.println("\nThe sorted array using counting sort :");
        for (int k : arr) {
            System.out.print(k+" ");
        }

    }
}
