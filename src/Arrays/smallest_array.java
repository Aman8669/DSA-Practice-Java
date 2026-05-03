package Arrays;

public class smallest_array {
    public static int Smallest(int[] arr){
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = {10,33,25,65,76};
        int smallest = Smallest(arr);

        System.out.println("The smallest value in the array is : "+smallest);
    }
}
