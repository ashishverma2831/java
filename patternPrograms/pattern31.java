package patternPrograms;

public class pattern31 {
    public static void main(String[] args){
        for(char i='A';i<='E';i++){
            for(char j=1,k=i;j<=5;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
