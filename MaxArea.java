public class MaxArea {
    public static void main(String[] args) {
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = maxArea(nums);

    }

    public static int maxArea(int[] nums) { //내가 푼거
        int answer = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans = (j - i) * Math.min(nums[i], nums[j]);
                if (answer < ans) {
                    answer = ans;
                    System.out.println("answer의 값이" + answer + " 로 교체!!");
                }
            }
        }
        return answer;
    }

    public static int maxArea2(int[] nums) { //GPT가 제시한 것
        int left = 0;
        int right = nums.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(nums[left], nums[right]);
            int width = right - left;
            int currentArea = minHeight * width;

            maxArea = Math.max(maxArea, currentArea);

            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }


}