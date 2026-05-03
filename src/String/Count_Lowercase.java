package String;

public class Count_Lowercase {
    public static int countLower(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == Character.toLowerCase(str.charAt(i)) && ch != ' '){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "A man Is king Of own Life";
        int result = countLower(str);
        System.out.println(result);

    }
}
