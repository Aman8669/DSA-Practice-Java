package Arrays;

public class pairs_array {
    public static void pairs(int[] arr){
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];  // 1,2,3,4,5,6

            for (int j = i+1; j < arr.length; j++) {
                System.out.print("( "+current+","+arr[j]+" )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair is : "+tp);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        pairs(arr);
    }
}
