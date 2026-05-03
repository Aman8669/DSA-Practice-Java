package Pesudocode_Flowchart;
import java.util.Scanner;
public class Avg25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum =0;
        int c=0;
        int totalSub = 25;

        for (int i = 1; i <= totalSub; i++) {

            System.out.print("Enter Score "+(c+1)+":");
            int s = sc.nextInt();
            sum = sum + s;
            c++;

         }

       double avg = (double) sum/totalSub;
        System.out.println("The total avg is "+avg);

    }
}



