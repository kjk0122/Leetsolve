import java.util.*;
import java.util.stream.IntStream;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int target = 3;
        int[] ans = maxSlidingWindow(nums, target);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || nums.length == 0) {
                return new int[0];
            }

            int n = nums.length;
            int[] result = new int[n - k + 1];
            Deque<Integer> deque = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                // 윈도우의 왼쪽 끝에서 벗어난 값 제거
                if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                    deque.poll();
                }

                // 현재 값보다 작은 값들 제거
                while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                    deque.pollLast();
                }

                deque.offer(i);

                // 결과 배열에 최대값 추가
                if (i - k + 1 >= 0) {
                    result[i - k + 1] = nums[deque.peek()];
                }
            }

            return result;
        }
}