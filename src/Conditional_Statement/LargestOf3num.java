package Conditional_Statement;

public class LargestOf3num {
    public static void main(String[] args) {
        int a = 10, b =43, c = 12;

        if (a>b && a>c)
        {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        }else
        {
            System.out.println(c);
        }
    }
}
