package OOPs;

public class Complex {

    public static void main(String[] args) {
        Operation op = new Operation();

        System.out.println(op.sum(10,20));
        System.out.println(op.difference(45,35));
        System.out.println(op.product(4,5));
    }
}
class Operation {


    int sum(int a, int b) {
        return a + b;
    }

    int difference(int a, int b) {
        return a - b;
    }

    int product(int a, int b) {
        return a * b;
    }
}