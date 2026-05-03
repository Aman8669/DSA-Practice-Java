package Conditional_Statement;

import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch (a)
        {
            case 1 :
                System.out.println("You eat burger");
                break;

            case 2 :
                System.out.println("You eat samosa");
                break;

            case 3 :
                System.out.println("You eat pizza");
                break;

            default:
                System.out.println("You are wake up to sleep");
        }
    }
}
