package function_methods;

public class addition {
    public static void CalculateSum(int a , int b)
    {
      int  sum = a + b;
        System.out.println("The sum is = "+sum);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        CalculateSum(a,b);
    }
}
