package function_methods;

public class SumOfDigit {
    public static int sumofdigit(int n){

        int sum = 0;
        while (n>0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int sumOfDigit = sumofdigit(451);
        System.out.println(sumOfDigit);
    }
}
