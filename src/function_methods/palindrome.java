package function_methods;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev = 0;
        while (n > 0) {
            rev = n % 10;
            n = n / 10;
            System.out.print(rev);

        }
        if (rev == n) {
            System.out.println("The given no is palindrome");
        }
        else {
            System.out.println("The no is not palindrome");
        }


    }
}
