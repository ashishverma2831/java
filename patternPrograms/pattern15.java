package patternPrograms;

public class pattern15 {
    public static void main(String[] args){
        int num = 5;
        for(int i=1;i<=num;i++){
            int x=i;
            int y=num-i+1;
            for(int j=1;j<=num;j++){
                if(j%2==1){
                    System.out.printf("%4d",y);
                }
                else{
                    System.out.printf("%4d",x);
                }
                x=x+num;
                y=y+num;
            }
            System.out.println();
        }
    }
}
