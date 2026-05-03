package Array_Part2.Assignment;

public class Aman {
    public static int addReturn(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,30,4,0,5};

        System.out.println( addReturn(arr));
    }
}
