package Array_Part2;

public class SumOfSubArray {
    public static void sumOfSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                CurrentSum = 0;
                for (int k = start; k <= end ; k++) {
                    CurrentSum += arr[k];

                }
                System.out.println(CurrentSum+" ");
                if (max < CurrentSum){
                    max = CurrentSum;
                }

            }

        }
        System.out.println("The Maximum Sum is : "+max);

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        sumOfSubarray(arr);
    }
}
