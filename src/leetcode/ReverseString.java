package leetcode;

public class ReverseString {
    public static String reverse(String s){
        String[] words = s.trim().split("\\s+");
        String rev = "";
        for (int i = words.length-1; i >=0 ; i--) {
            rev +=   words[i];
            if(i != 0){
                rev += " ";
            }
        }
        return rev;
    }
    public static void main(String[] args) {
        String s =  "the sky is blue";
        String result = reverse(s);
        System.out.println(result);

    }
}
