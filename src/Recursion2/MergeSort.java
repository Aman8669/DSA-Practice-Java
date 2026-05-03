package Recursion2;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        SortArray(arr, 0, arr.length-1);
        printArr(arr);

    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void SortArray(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si +(ei - si)/2;SortArray(arr, 0, mid);
        SortArray(arr, mid+1, ei);//left part
        Mergesort(arr,si,ei, mid);// rigth part
    }

    public static void Mergesort(int[] arr, int si, int ei, int mid){
        int[] temp = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<= mid && j<= ei){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
}
