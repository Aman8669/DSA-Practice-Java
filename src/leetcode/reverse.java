package leetcode;

public class reverse {
    public static boolean reverse(int x){

        int rev = 0;
            int newRev = rev;
        while (x > 0){
            int lastDigit = x % 10;
            x = x / 10;

            rev = rev * 10 + lastDigit;


        }
        System.out.print(rev);
       return  newRev == x;

    }
    public static void main(String[] args) {
        int x = 1234;

        System.out.println(reverse(x));
    }

}
