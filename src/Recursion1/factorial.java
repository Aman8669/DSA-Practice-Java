package Recursion1;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }
    public static int Fact(int n){
        if (n==0) {
            return 1;
        }
        int Fnm1 = Fact(n-1);
        int Fn = n * Fact(n-1);
        return Fn;
    }
}
