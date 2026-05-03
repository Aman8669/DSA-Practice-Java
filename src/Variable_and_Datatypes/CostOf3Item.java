package Variable_and_Datatypes;

import java.util.Scanner;

public class CostOf3Item {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the pen cost");
        float penCost = sc.nextFloat();

        System.out.println("Enter the pencil cost");
        float pencilCost = sc.nextFloat();

        System.out.println("Enter the eraser cost");
        float eraserCost = sc.nextFloat();

        float total = pencilCost + penCost+ eraserCost;
        System.out.println("The bill is "+total);
        float gst = total * 18/100;

        float totalCost = total+gst;


        System.out.println("The total cost with 18% include GST is : "+totalCost);
        System.out.println("======================================");
    }
}
