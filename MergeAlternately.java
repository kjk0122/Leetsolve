public class MergeAlternately {
    public static void main(String[] args) {
        String word1 = "ACE";
        String word2 = "BDGHT";
        String compressed = mergeAlternately(word1, word2);
        System.out.println(compressed);
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int length = Math.max(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}
