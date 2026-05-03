package Recursion1;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
    }
    public static int Sum(int n){
        if (n == 1){
            return 1;
        }
        int Nmbr = Sum(n-1);
        int sumofNatural = n + Sum(n-1);
        return  sumofNatural;
    }
}
