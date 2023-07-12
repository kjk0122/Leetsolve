public class Merge {
    public static void main(String[] args) {
        String word1 = "ACE";
        String word2 = "BDGHT";
        String compressed = mergeAlternately(word1, word2);
        System.out.println(compressed);
    }

    public static String mergeAlternately(String word1, String word2) { //숫자와 알파벳을 추려주는 것
        String a;
        String b;

        if(word1.length()>=word2.length()){
        a=word1;
        b=word2;
        }else{
        b=word1;
        a=word2;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
        }
        for(int j=b.length();j<a.length();j++){
        sb.append(a.charAt(j));
        }
        return sb.toString();
    }
}
