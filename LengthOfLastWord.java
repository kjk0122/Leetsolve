public class LengthOfLastWord {
    public static void main(String[] args) {
        String nums = "sdds fsfsds   ";
        int answer = lengthOfLastWord(nums);
        System.out.println(answer);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] arr =  s.split("\\s+");

        return arr[arr.length-1].length();
    }
}