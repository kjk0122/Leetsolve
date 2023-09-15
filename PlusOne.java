import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] cost = {9,8,7,6,5,4,3,2,1,0};
        int[] answer = plusOne(cost);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] plusOne(int[] digits) {
        BigInteger num = new BigInteger("0");

        for (int digit : digits) {
            num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }

        num = num.add(BigInteger.ONE);

        String numStr = num.toString();
        int[] result = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(i) - '0';
        }

        return result;
    }
}