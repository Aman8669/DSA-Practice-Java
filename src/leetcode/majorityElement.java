package leetcode;

public class majorityElement {
    public static int majorElement(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count> 0 && count <2){
                return arr[i];
            }
         }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int major = majorElement(arr);
        System.out.println("The majority element is : "+major);
    }
}
