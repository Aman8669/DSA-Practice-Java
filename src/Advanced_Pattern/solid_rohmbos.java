package Advanced_Pattern;

public class solid_rohmbos {
    public static void solid_rohm(int n){
        for (int i = 1 ; i <=n; i++) {
        //for spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rohm(10);
    }
}
