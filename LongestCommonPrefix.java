public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] nums = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(nums));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0]; // 첫 번째 문자열을 기준으로 설정합니다.

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}