package arrays;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,10,2,7,11,15};
        int target = 9;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    System.out.println((i+1)+","+(j+1));
                    System.exit(0);
                }
            }
        }
        sc.close();
    }
}
