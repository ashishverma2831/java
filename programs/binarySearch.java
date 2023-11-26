public class binarySearch {
    public static void main(String[] args){
        int num = 99;
        int array[] = {23,34,45,60,76,89,98};

        java.util.Arrays.sort(array);
        int found = 0;
        int low = 0,
            high = array.length -1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid]==num){
                found = 1;
                System.out.println("\nElement found at "+(mid+1));
                break;
            }
            else if(array[mid]>num){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if(found==0){
            System.out.println("Element not found in the array.");
        }

    }
}
