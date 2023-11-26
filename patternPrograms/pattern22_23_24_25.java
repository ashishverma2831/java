package patternPrograms;

public class pattern22_23_24_25 {
        public static void main(String[] args){
            //pattern 22
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(i%2==0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" 0 ");
                    }
                }
                System.out.println();
            }
            //pattern 23
            System.out.println("**************");
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(i%2==0){
                        System.out.print(" 0 ");
                    }
                    else{
                        System.out.print(" 1 ");
                    }
                }
                System.out.println();
            }
            //pattern 24
            System.out.println("**************");
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(j%2==0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" 0 ");
                    }
                }
                System.out.println();
            }
            //pattern 25
            System.out.println("**************");
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(j%2==0){
                        System.out.print(" 0 ");
                    }
                    else{
                        System.out.print(" 1 ");
                    }
                }
                System.out.println();
            }
    }
}
