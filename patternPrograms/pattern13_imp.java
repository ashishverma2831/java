package patternPrograms;

public class pattern13_imp{
    public static void main(String[] args){
        int num = 5;
        for(int i=1;i<=num;i++){
            int k=i;
            for(int j=1;j<=num;j++){
                if(j%2==1){
                    System.out.printf("%4d",k);
                    k=k+(2*num-(2*i-1));
                }
                else{
                    System.out.printf("%4d",k);
                    k=k+(2*i-1);
                }
            }
            System.out.println();
        }
    }
}