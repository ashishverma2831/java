package patternPrograms;

public class pattern33 {
    public static void main(String[] args){
        for(char i='E';i>='A';i--){
            char k=i;
            for(int j=1;j<=5;j++){
                System.out.print(k+" ");
                k+=5;
            }
            System.out.println();
        }
    }
}
