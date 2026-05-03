package TwoD_Array;

public class duplicateCount {
    public static int duplCount(int[][] matrix ,int key){
        int count =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix = {{4,7,8,7},{8,8,7,1}};
        int key = 7;
        System.out.println("The "+key+" is "+duplCount(matrix,key)+" times returned");
    }
}
