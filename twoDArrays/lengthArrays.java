package twoDArrays;

public class lengthArrays {
    public static void main(String[] args){

        // 1d array length
        int arrayA[] = new int[4];
        System.out.println("\nThe length of the 1D array is "+arrayA.length);
        System.out.println("\nRepresentation of 1D array : ");
        for(int i=0;i<arrayA.length;i++){
            System.out.printf("%2d",arrayA[i]);
        }

        // 2d array length
        int arrayB[][] = new int[5][4];
        System.out.println("\nThe length of the 2D array is "+arrayB.length);
        System.out.println("\nRepresentation of 2D array : ");
        for(int j=0;j<arrayB.length;j++){
            for(int k=0;k<arrayB[0].length;k++){
                System.out.printf("%2d",arrayB[j][k]);
            }
            System.out.println();
        }

        // 3d array length
        int arrayC[][][] = new int[8][5][4];
        System.out.println("\nThe length of the 3D array is "+arrayC.length);
        System.out.println("\nRepresentation of 3D array : ");
        for(int i=0;i<arrayC.length;i++){
            for(int j=0;j<arrayC[0].length;j++){
                for(int k=0;k<arrayC[0][0].length;k++){
                    System.out.printf("%2d",arrayC[i][j][k]);
                }
                System.out.println("***");
            }
            System.out.println("###########");
        }

        // jagged array
        int arrayD[][] = new int[4][];
        arrayD[0] = new int[4];
        arrayD[1] = new int[8];
        arrayD[2] = new int[2];
        arrayD[3] = new int[6];
        System.out.println("\nThe length of the Jagged array is "+arrayD.length);
        System.out.println("\nRepresentation of Jagged array : ");
        for(int j=0;j<arrayD.length;j++){
            for(int k=0;k<arrayD[j].length;k++){
                System.out.printf("%2d",arrayD[j][k]);
            }
            System.out.println();
        }

    }
}
