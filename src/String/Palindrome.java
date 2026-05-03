package String;
import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String word){
        int lastWord = word.length();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch != word.charAt(lastWord-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "noon";
        System.out.println(isPalindrome(word));
    }
}
