package loops;

public class diamond {
    public static void main(String[] args){
        int num = 5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
               if(j<num+1-i){
                System.out.print("  ");
               } 
               else{
                if((i==num)||(j==num)){
                    System.out.print("# ");
                }
                else{
                    System.out.print("* ");
                }
               }
            }
            for(int k=1;k<=num;k++){
                if(k<i){
                    if(i==num){
                        System.out.print("# ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int l=1;l<=num;l++){
            for(int m=1;m<=num;m++){
                if(m>l){
                    if(m==num){
                        System.out.print("# ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int n=1;n<=num;n++){
                if(n<num-l){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
