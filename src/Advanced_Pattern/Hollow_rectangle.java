package Advanced_Pattern;

public class Hollow_rectangle {
    public static void hollowRectangle(int totalRow, int totalCol){
        //outer loop -> rows
        for (int i = 1; i <=totalRow ; i++) {
            //inner loop -> colums
            for (int j = 1; j <=totalCol ; j++) {
                if (i == 1 || i == totalRow || j == 1 || j == totalCol){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
             }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(4,5) ;
    }
}
