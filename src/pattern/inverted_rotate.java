package pattern;

public class inverted_rotate {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n ; i++) {

            for (int space = n; space <=n-i+1 ; space++) {
                    System.out.print(" ");
                    for (int star = 1; star <= i; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
