package function_methods;

import java.util.Scanner;

public class product {
    public static void Product()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int prod= a*b;

        System.out.println(prod);
    }

    public static void main(String[] args) {
      Product();

    }
}
