import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] cost = {1, 2, 3};
        int answer = minimumCost(cost);
        System.out.println(answer);
    }

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count = 0;
        int total = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            if (count != 2) {
                total += cost[i];
                count++;
            } else {
                count = 0;
            }
        }
        return total;
    }
}