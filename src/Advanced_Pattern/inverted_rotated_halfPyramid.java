package Advanced_Pattern;

public class inverted_rotated_halfPyramid {
    public static void invertedPyr(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n -i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedPyr(4);
    }
}
