public class ThreeDArr {
    public static void main(String args[]) {

        int arr[][][] = new int[3][4][5];   // 3D array with sizes 3, 4, 5
        // Storing random values in the array
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 5; k++){
                    arr[i][j][k] = (int)(Math.random() * 10);  // values 0 to 9
                }
            }
        }

        // Printing the 3D array
        for(int i = 0; i < 3; i++){
            System.out.println("Block " + (i+1) + ":");
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 5; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();  // new line for each row
            }
            System.out.println();  // space between blocks
        }
    }
}

