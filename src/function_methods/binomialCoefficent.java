package function_methods;

public class binomialCoefficent {
    public static int factorial(int n)
    {
        int f = 1;

        for (int i = 1; i <= n  ; i++) {
            f = f*i;

        }
        return f;
    }
    public static int binCoeff(int n, int r)
    {
        int fact_r = factorial(r);
        int fac_n  = factorial(n);
        int fact_nmr = factorial(n-r);

        return fac_n/(fact_r*fact_nmr);
    }

    public static void main(String[] args) {
        int binCoeff = binCoeff(5,2);
        System.out.println(binCoeff);
    }
}
