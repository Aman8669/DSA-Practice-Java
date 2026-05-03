package TwoD_Array;

public class spiralMatrix {
     public static void spiral(int[][] matrix){

         int startRow = 0;
         int endRow = 3;
         int startCol = 0;
         int endCol = 3;

         while (startRow<= endRow && startCol<= endCol) {
             // upper row print
             for (int i = startCol; i <= endCol; i++) {
                 System.out.print(matrix[startRow][i] + " ");
             }
             // Right Column printed
             for (int j = startRow + 1; j <= endRow; j++) {
                 System.out.print(matrix[j][endCol]+ " ");
             }
             // lower row
             for (int i = endCol - 1; i >= startCol; i--) {
                 if (startRow == endRow){
                     break;
                 }
                 System.out.print(matrix[endRow][i] + " ");
             }
             //left column
             for (int j = endRow - 1; j >= startRow + 1; j--) {
                 if (startCol == endCol){
                     break;
                 }
                 System.out.print(matrix[j][startCol] + " ");
             }

             startRow++;
             endRow--;
             startCol++;
             endCol--;
         }
         System.out.println();
     }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {4,5,6,7},
                          {8,9,10,11},
                         {12,13,14,15}};
        spiral(matrix);
    }
}
