package Recursion1;

public class lastOccurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,5};
        System.out.println(laststOccure(arr, 5, 0));
    }
    public static int laststOccure(int[] arr, int key, int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = laststOccure(arr, key, i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
}
