package Recursion1;

public class xPown {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x,n));
    }
    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        int pow = x * power(x,n-1);
        return pow;
    }
}
