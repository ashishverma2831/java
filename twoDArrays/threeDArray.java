package twoDArrays;

public class threeDArray {
    public static void main(String[] args) {
        int array[][][] = {
            {{1,2,3},{4,5,6},{7,8,9}},
            {{1,2,3},{4,5,6},{7,8,9}},
            {{1,2,3},{4,5,6},{7,8,9}}
        };
        //foreach loop
        for(int i[][] : array){
            for(int j[] : i){
                for(int k : j){
                    System.out.print(k+"  ");
                }
                System.out.println("$");
            }
            System.out.println("*****");
        }

        // for loop
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                for(int k=0;k<array[0][0].length;k++){
                    System.out.print(array[i][j][k]+"  ");
                }
                System.out.println("$");
            }
            System.out.println("*****");
        }
    }
}
