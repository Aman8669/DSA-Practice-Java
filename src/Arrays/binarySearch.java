package Arrays;

public class binarySearch {
    public static int binarysearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;

        while (start<= end){
            int mid = (start+end)/2;
            
            if (arr[mid] == key){
                return mid;
            }
            if (key >arr[mid]){
                start= mid +1; 
               }else{
                end = end -1;
            }
            
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={2,4,6,8,10,12,14};
        int key = 14;
        System.out.println("Index of key is : "+ binarysearch(arr,key));


    }
}
