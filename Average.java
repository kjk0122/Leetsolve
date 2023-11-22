public class Average {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        double av = average(nums);
        System.out.println(av);
    }

    public static double average(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        return answer/numbers.length;
    }
}
