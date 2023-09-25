public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {0, 3, 1, 0, 1};
        int n = 1;
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        int i = 0;
        while (i < nums.length - 1) {
            ans = ans ^ nums[i + 1];
            i++;
        }
        return ans;
    }
}
