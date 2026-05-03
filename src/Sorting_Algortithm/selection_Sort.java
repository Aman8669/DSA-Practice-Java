package Sorting_Algortithm;

public class selection_Sort {
    public static void Selection(int[] arr){
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minPos = turn;
            for (int i = turn+1; i <arr.length ; i++) {
                if (arr[minPos]>arr[i]){
                    minPos = arr[i];
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
    }
    public static void PrintArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr =  {5,4,1,2,3};
        Selection(arr);
        PrintArr(arr);
    }
}
