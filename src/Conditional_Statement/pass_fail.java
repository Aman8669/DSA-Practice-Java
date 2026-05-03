package Conditional_Statement;

import java.io.StringReader;
import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        String record = (marks>=33) ? "PASS" : "FAIL";
        System.out.println(record);
    }
}
