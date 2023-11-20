import java.util.Arrays;

public class NumberGCD {
    public static void main(String[] args) {
        int[] k = numberGCD(3,2,4,5);
        System.out.println(Arrays.toString(k));
    }
    public static int[] numberGCD(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        // 최대공약수를 계산
        int gcd = getGCD(numer, denom);

        // 기약 분수로 만들어 배열에 담아 반환
        return new int[]{numer / gcd, denom / gcd};
    }
    // 최대공약수를 계산하는 메서드
    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCD(num2, num1 % num2);
    }
}
