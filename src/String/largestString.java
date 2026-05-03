package String;

public class largestString {
    public static void main(String[] args) {
        String[] list = {"apple", "mango", "banana"};
        String largest = list[0];

        for (int i = 0; i < list.length; i++) {
          if (largest.compareTo(list[i])<0) {
              largest = list[i];
          }

        }
        System.out.println(largest);
    }
}
