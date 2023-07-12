public class hello {
    public static void main(String[] args) {
        String input = "ABBBCCCCDDDD";
        String compressed = compressString(input);
        System.out.println(compressed);
    }

    public static String compressString(String input) { //숫자와 알파벳을 추려주는 것
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                count++;
            } else {
                sb.append(count);
                sb.append(input.charAt(i - 1));
                count = 1;
            }
        }

        sb.append(count);
        sb.append(input.charAt(input.length() - 1));

        if (input.length() <= sb.length()) {
            return input;
        } else {
            return sb.toString();
        }
    }
}
