package String;

public class SubString {
    public static String subString(String name, int si, int ei){
        String SubStr = "";
        for (int i = si; i <ei ; i++) {
            SubStr += name.charAt(i);
        }
        return SubStr;
    }
    public static void main(String[] args) {
        String name = "Hellowworld";
//        System.out.println(name.substring(0,5));
        System.out.println(subString(name,0,5));
    }
}
