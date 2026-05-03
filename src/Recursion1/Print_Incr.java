package Recursion1;

public class Print_Incr {
    public static void main(String[] args) {
        int n=10;
        PrintInc(n);
    }
    public static void PrintInc(int n){
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");


    }
}
