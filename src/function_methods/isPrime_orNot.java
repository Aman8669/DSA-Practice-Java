package function_methods;

public class isPrime_orNot {
    public static boolean isPrime(int n)
    {
        if (n == 2)
        {
            return true;
        }
        boolean isPrime = true;

        for (int i = 2; i <= n-1 ; i++) {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void listOfPrime(int n)
    {
        for (int i = 2; i <=n ; i++) {
            if (isPrime(i))  // true condition
            {
                System.out.print(i+", ");
            }
        }
    }

    public static void main(String[] args) {
        listOfPrime(20);
    }
}
