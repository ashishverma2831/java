package loops;

public class pattern3 {
    public static void main(String[] args){
        int num=5;
        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=num+1-i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=num;j++){
        //         if(j<i){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=num;i++){
        //     for(int j=1;j<=num;j++){
        //         if(j<num+1-i){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j<num+1-i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int k=1;k<=num;k++){
                if(k<i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int l=1;l<=num-1;l++){
            for(int m=1;m<=num;m++){
                if(m>l){
                    System.out.print("* ");
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
