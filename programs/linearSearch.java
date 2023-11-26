import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search :");
        int num = sc.nextInt();

        int array[] = {23,45,67,12,98,89};

        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                System.out.println("Entered number is found at position "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("Element is not found in the array");
        sc.close();
    }
}
