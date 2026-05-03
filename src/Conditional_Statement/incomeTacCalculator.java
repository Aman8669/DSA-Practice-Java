package Conditional_Statement;

import java.util.Scanner;

public class incomeTacCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income and know your tax");
        int income = sc.nextInt();
        int tax = 0;

        if (income < 50000)
        {
            tax = 0;
        }
        else if (income >50000 && income <1000000)
        {
            tax = (int)(income * 0.2);
        }
        else
        {
            tax = (int) (income * 0.3);
        }

        System.out.println("Your Tax is : "+tax);
    }
}
