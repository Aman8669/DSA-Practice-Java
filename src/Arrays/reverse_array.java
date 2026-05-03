package Arrays;

public class reverse_array {
//    public static void reverseArray(int[] arr){
//        int first = 0;
//        int last = arr.length-1;
//
//        while (first <last){
//            int temp = arr[last];
//            arr[last] = arr[first];
//            arr[first] = temp;
//
//            first++;
//            last--;
//        }
//
//    }

    public static void main(String[] args) {
        int[] arr = {10, 32, 4, 3, 24, 24};
        int key = 3;

        int FindKey = BinarySearch(arr,key);
        System.out.println(FindKey);

    }

    public static int BinarySearch(int[] arr, int key){

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start+(end-start)/2;


            if(arr[mid]>key){
                start = mid+1;
            }
            else if(arr[mid]<key){
                end = mid-1;
            }
            else {
                return mid;
            }

    }
        return -1;
        }
}
