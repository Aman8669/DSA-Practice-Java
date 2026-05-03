package Arrays;

import java.util.Scanner;

public class input_output_update {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phy marks");
        arr[0] = sc.nextInt();
        System.out.println("Enter your chem marks");
        arr[1] = sc.nextInt();
        System.out.println("Enter your maths marks");
        arr[2] = sc.nextInt();

        float percentage = (float) (arr[0]+arr[1]+arr[2])/3;

        System.out.print("The percentage is ="+percentage+"%");
    }
}
