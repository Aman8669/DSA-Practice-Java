package leetcode;

 class alternateAdd {
    public static String mergeAlternately(String word1, String word2) {
        // StringBuilder is used to efficiently build the final merged string
        StringBuilder sb = new StringBuilder();

        // Store length of both input strings
        int l1 = word1.length();
        int l2 = word2.length();

        // 'i' will act as index for both strings
        int i = 0;

        // Loop jab tak dono strings ka end nahi aa jaata
        while (i < l1 || i < l2) {
            // Agar word1 ka current index i valid hai toh uska character append karo
            if (i < l1) {
                sb.append(word1.charAt(i));  // word1 ka i-th character
            }

            // Agar word2 ka current index i valid hai toh uska character append karo
            if (i < l2) {
                sb.append(word2.charAt(i));  // word2 ka i-th character
            }

            // Index ko aage badhao
            i++;
        }

        // Final merged string return karo
        return sb.toString();
    }


    public static void main(String[] args) {
        String word1 = "abcd";
       String word2="pq";
        System.out.println(mergeAlternately(word1,word2));
    }
}

