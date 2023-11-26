package patternPrograms;

public class pattern17 {
    public static void main(String[] args) {
        for(int i=1;i<=2*5;i+=2){ 
            for(int j=1,k=i;j<=5;j++){
                System.out.printf("%4d",k);      //2*(i+j)-3
                k+=2;
            }
            System.out.println();
        }
    }
}
