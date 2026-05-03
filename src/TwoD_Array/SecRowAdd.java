package TwoD_Array;

public class SecRowAdd {
    public static int secrowsum(int[][] matrix){
        int sum =0;

        for (int i = 0; i < matrix.length; i++) {
            int col = matrix[0].length-1;
            while (i==1 && col >=0){
                sum  += matrix[i][col];
                col--;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix =
                {{1,4,3},
                 {11,4,3},
                {2,2,3}};
        System.out.println("The sum of second row is : "+secrowsum(matrix));
    }
}
