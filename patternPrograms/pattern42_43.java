package patternPrograms;

public class pattern42_43 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1,k=i;j<=i;j++){
                System.out.printf("%4d",k);
                k++;
            }
            System.out.println();
        }
        System.out.println("----------------------");
        //pattern 43
        for(int i=1;i<=2*5;i+=2){
            int k=i;
            for(int j=1;j<=i;j+=2){
                System.out.printf("%4d",k);
                k+=2;
            }
            System.out.println();
        }
    }
}
