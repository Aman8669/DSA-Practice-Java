package Variable_and_Datatypes;

import java.util.Scanner;

public class AreaOfSqure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Squre ");
        int SideOfSqure = sc.nextInt();

        System.out.println("The are of squre is "+SideOfSqure*SideOfSqure);
    }
}
