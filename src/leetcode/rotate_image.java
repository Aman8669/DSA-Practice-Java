package leetcode;

public class rotate_image {
    public static void rotateimg(int[][] matrix){
        for(int i=0; i<matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    for (int i = 0; i < matrix.length; i++) {
        int left = 0;
        int rigth = matrix.length - 1;

        while (left < rigth) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][rigth];
            matrix[i][rigth]= temp;
            left++;
            rigth--;
        }
    }
}
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { // Row ke liye loop
            for (int j = 0; j < matrix[0].length; j++) { // Column ke liye loop
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Ek row print hone ke baad new line
        }
    }
    public static void main(String[] args) {
        int[][] matrix =
                {{1,2,3},
                {4,5,6},
                {7,8,9}};
       rotateimg(matrix);
       printMatrix(matrix);
    }
}
