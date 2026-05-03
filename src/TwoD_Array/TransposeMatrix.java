package TwoD_Array;

public class TransposeMatrix {
    public static void transpose(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i =0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
    }
    public static void PrintTranspose(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix[0].length]);
        }
    }
    public static void main(String[] args) {
        int[][] matrix =
                {{11,12,13},
                {21,22,23}};
        transpose(matrix);
        PrintTranspose(matrix);
    }
}
