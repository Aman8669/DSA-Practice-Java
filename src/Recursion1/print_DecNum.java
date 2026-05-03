package Recursion1;

public class print_DecNum {
    public static void main(String[] args) {
        int n=10;
        PrintDec(n);
    }
    public static void PrintDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
}
