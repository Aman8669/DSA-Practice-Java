package Recursion2;

public class TillingProblem {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(tiles(n));
    }
    public static int tiles(int n){
        // base case
        if (n==0 || n == 1){
            return 1;
        }
        // kaam
        // vertical
        int vertical = tiles(n-1);
        // horizontal
        int horizontal = tiles(n-2);

        int totalWays = vertical + horizontal;

        return totalWays;
    }
}
