public class CountAndSay {
    public static void main(String[] args) {
        int n = 3;
        String Parenthesis = countAndSay(n);
        System.out.println(Parenthesis);
    }

    public static String countAndSay(int n) {

        StringBuilder st = new StringBuilder();
        String nSt = String.valueOf(n);
        String nStZero= String.valueOf(nSt.charAt(0));

        for (int i = 0; i < nSt.length(); i++) {
            int count=0;
            count++;
            if (i == 0) {

            } else {
                nSt.charAt(1);
            }
        }
        return nSt;
    }
}