package Recursion1;

public class firstOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,5};
        System.out.println(firstOccure(arr, 5, 0));

    }
    public static int firstOccure(int[] arr , int key , int i){
        if (arr[i] == key){
            return i;
        }
        if (i == arr.length-1){
            return -1;
        }
        return firstOccure(arr, key, i+1);
    }
}
