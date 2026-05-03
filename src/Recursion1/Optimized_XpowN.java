package Recursion1;

public class Optimized_XpowN {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x,n));
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpow = power(x, n/2);
        int halfpowsq = halfpow  * halfpow;
        if (n % 2 != 0){
            halfpowsq = x * halfpowsq;
        }
        return halfpowsq;
    }
}
