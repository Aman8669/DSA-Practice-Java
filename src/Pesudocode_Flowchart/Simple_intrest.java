package Pesudocode_Flowchart;

import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // principle = p
        // rate = r
        // time = t

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int SI = p*r*t/100;

        System.out.println("Simple Intrest is "+SI);
    }
}
