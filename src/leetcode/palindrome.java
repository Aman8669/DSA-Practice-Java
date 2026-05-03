package leetcode;

public class palindrome {
    public static boolean isPalindrome(int x) {
        int original = x;             // Save the original number
        int rev = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            x = x / 10;
            rev = rev * 10 + lastDigit;
        }
        System.out.println(rev);
        // Compare original with reversed number
        return original == rev;
    }



    public static void main(String[] args) {


        System.out.println(isPalindrome(123));
    }

}
