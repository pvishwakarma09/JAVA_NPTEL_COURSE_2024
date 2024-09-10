// Declair and allocate 3d array example 
// import java.lang.*;

class a3DArray {
    public static void main(String[] args) {
        int my3DArray[][][] = new int[3][4][5];
        int i, j, k;

        // Initializing the 3D array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    my3DArray[i][j][k] = i * j * k;
                }
            }
        }

        // Printing the 3D array
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(my3DArray[i][j][k] + " ");
                }
                System.out.println(); // New line after each 1D array in the 2D slice
            }
            System.out.println(); // New line after each 2D slice in the 3D array
        }
    }
}
