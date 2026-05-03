package function_methods;

public class avgOf3num {
    public static void avg3(int a, int b, int c){
        int d = a + b + c;
        int avg = d/3;

        System.out.println("The avg of three numbers are "+avg);
    }

    public static void main(String[] args) {
        avg3(78,45,56);
    }
}
