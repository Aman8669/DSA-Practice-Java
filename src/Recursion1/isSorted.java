package Recursion1;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.print(sorted(arr,0));

    }
    public static boolean sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sorted(arr,i+1);

    }
}
