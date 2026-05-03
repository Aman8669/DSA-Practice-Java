package String;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()){
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result = Arrays.equals(str1Array,str2Array);

            if (result){
                System.out.println(str1+" "+"And "+str2+" is Anagrams");
            }else{
                System.out.println(str1+" "+"And "+str2+" is Not Anagrams");
            }
        }else{
            System.out.println(str1+" "+"And "+str2+" is not Anagrams");
        }

    }
}
