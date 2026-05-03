package Recursion2;

public class PairFriends {
    public static void main(String[] args) {
        System.out.println(wayOfPair(3));
    }
    public static int wayOfPair(int n){
        if (n == 1 || n == 2){
            return n;
        }
//        // single
//        int fnm1 = wayOfPair(n-1);
//        //pair
//        int fnm2 = wayOfPair(n-2);
//
//        int wayofpair = (n-1) * fnm2;
//        int totalpair = fnm1 + wayofpair;
//        return totalpair;

        return wayOfPair(n-1) + (n-1) * wayOfPair((n-2));
    }
}
