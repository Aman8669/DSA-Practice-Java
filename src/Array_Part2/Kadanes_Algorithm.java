package Array_Part2;

public class Kadanes_Algorithm {

    public static void kadanes(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            CurrentSum = CurrentSum + arr[i];

                if (CurrentSum < 0){
                    CurrentSum = 0;
                }

                maxSum = Integer.max(CurrentSum , maxSum);
        }
        System.out.println("The Maxixmum Sum of SubArray is : "+maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        kadanes(arr);
    }
}
