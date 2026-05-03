package leetcode;

public class String_Palindrome {
    public static boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right =clean.length()-1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
