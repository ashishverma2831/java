package accenture;

public class CountDigit{
    public static void main(String args[]){
        CountDigit obj = new CountDigit();
        int result  = obj.countDigitOccurences(1,30,2);
        System.out.println(result);
    }

    int countDigitOccurences(int l,int u,int x){
        int count = 0;
        for(int i=l;i<=u;i++){
            int num=i;
            while(num>0){
                if(num%10==x){
                    count++;
                }
                num/=10;
            }
        }
        return count;
    }
}
