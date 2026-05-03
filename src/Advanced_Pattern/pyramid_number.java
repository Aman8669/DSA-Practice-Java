package Advanced_Pattern;

public class pyramid_number {
    public static void pyr_num(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyr_num(9);
    }
}
