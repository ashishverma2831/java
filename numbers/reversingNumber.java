package numbers;

public class reversingNumber {
    public static void main(String[] args) {
        int num[]={1,2,3,4,0};
        int size = num.length;
        int numNot[] = new int[size];

        for(int i=0;i<num.length;i++){
            numNot[i]=num[i];
        }

        for(int i=0;i<num.length;i++){
            int j=num.length-1-i;
            num[i]=numNot[j];
        }
        for (int i : num) {
            System.out.print(i);
        }
    }
}
