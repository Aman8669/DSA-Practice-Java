package Arrays;

public class pass_arguments {
    public static void update(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,19,29,39};
        update(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
