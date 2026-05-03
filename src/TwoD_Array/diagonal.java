package TwoD_Array;

public class diagonal {
    public static int dig(int[][] matrix){
        int sum =0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
     }
       return sum;

    }
    public static void main(String[] args) {
        int[][] matrix = {{4,6,3,6,},
                          {8,6,7,5,},
                          {1,3,4,8,},
                          {2,7,8,9,}};
        System.out.println(dig(matrix));
    }
}
