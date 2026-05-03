package Arrays;

public class largest_array {
//    public static int largest(int[] arr){
//        int largest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]> largest){
//                largest = arr[i];
//            }
//        }
//        return largest;
//    }
    public static void main(String[] args) {
        int[] arr ={10,32,4,2,543,54,52};
        int largest = largest(arr);
        System.out.println("The largest element in the array : "+largest);


    }
    public static int largest(int[] arr){
        int max = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < max){
                max = arr[i];
            }
        }
        return max;
    }
}
