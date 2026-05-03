package function_methods;

public class EvenOrNot {
    public static void EvenOrnot(int n){
        if (n%2 == 0){
            System.out.println("Given no is even");
        }
        else {
            System.out.println("The given number is odd");
        }
    }

    public static void main(String[] args) {
        EvenOrnot(12);
    }

}
