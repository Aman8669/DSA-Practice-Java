package function_methods;

public class BinaryToDecimal {
    public static void BinDec(int binNum){
        int Mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum >0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
           binNum  = binNum / 10;

        }
        System.out.println("the binary No of "+Mynum+" = "+decNum);
    }

    public static void main(String[] args) {
       BinDec(101);

    }
}
