package patternPrograms;

public class pattern20_21 {
        public static void main(String[] args){
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(i%2!=0){
                        if((i+j)%2==0){
                            System.out.print("1 ");
                        }
                        else{
                            System.out.print("0 ");
                        }
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            System.out.println("*********");
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5;j++){
                    if(i%2!=0){
                        if((i+j)%2==0){
                            System.out.print("0 ");
                        }
                        else{
                            System.out.print("1 ");
                        }
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
}
