package Arrays;

public class linear_search {
    public static int linearsearch(int[] number,int key){
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] number ={10,2,3,4,56,43,24};
        int key = 4;

        int index = linearsearch(number,key);

        if (index == -1){
            System.out.println("NOT FOUND");
        }else {
            System.out.println("The key at index is ="+ index);
        }

    }
}

