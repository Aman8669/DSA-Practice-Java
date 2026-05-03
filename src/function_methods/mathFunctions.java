package function_methods;

public class mathFunctions {
    public static void main(String[] args) {
        int age1 = 23;
        int age2 = 31;

        int larestAge = Math.max(age1,age2);

        System.out.println("The largest age is "+larestAge);
        System.out.println("================================");
        int mondayTemp = -4;
        int tuesdayTemp = 10;

        int Mintemp = Math.min(mondayTemp,tuesdayTemp);
        System.out.println("The minimum temprature is "+Mintemp);
        System.out.println("===============================");

        int rate = 200;
        int available = -200;

        int positive = Math.abs(available);
        System.out.println("The positive value of this "+positive);


    }
}
