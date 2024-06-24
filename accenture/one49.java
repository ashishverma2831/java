package accenture;

import java.util.Scanner;

public class one49 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        one49 obj = new one49();
        int result  = obj.CountSpecificNumbers(m, n);
        System.out.println(result);

        sc.close();
    }

    int CountSpecificNumbers(int m,int n){
        int count = 0;
        if(m>n){
            return -1;
        }
        for(int i=m;i<=n;i++){
            int num=i;
            int flag=0;
            while(num>0){
                if(num%10==0 || num%10==2 || num%10==3 || num%10==5 || num%10==6 || num%10==7 || num%10==8){
                    flag=1;
                    break;
                }
                num/=10;
            }
            if(flag==0){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
