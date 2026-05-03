package Advanced_Pattern;

public class invhalfpyr_WithNumber {
    public static void ihpwn(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        ihpwn(5);
    }
}
