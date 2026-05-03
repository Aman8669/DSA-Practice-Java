package Variable_and_Datatypes;

import java.util.Scanner;

public class avg3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num ");
        int a = sc.nextInt();
        System.out.println("Enter Second num ");
        int b = sc.nextInt();
        System.out.println("Enter Third num ");
        int c = sc.nextInt();

        double avg =(a+b+c/3);
        System.out.println("The avg is "+avg);
    }
}
