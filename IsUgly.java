public class IsUgly {
    public static void main(String[] args) {
        int k = 1;
        System.out.println(isUgly(7));
        for(int i=1;i<10;i++){
        System.out.println(nthUglyNumber(i));
        }

    }

    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }

    public static boolean isUgly2(int n) {
        if (n == 0)
            return false;
        for (int prime : new int[]{2, 3, 5}) //이런 형태의 for문은 본 적이 없다...매우 신기
            while (n % prime == 0)
                n /= prime;
        return n == 1;
    }

    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(ugly[i2] * 2, Math.min(ugly[i3] * 3, ugly[i5] * 5));
            ugly[i] = nextUgly;

            if (nextUgly == ugly[i2] * 2) {
                i2++;
            }
            if (nextUgly == ugly[i3] * 3) {
                i3++;
            }
            if (nextUgly == ugly[i5] * 5) {
                i5++;
            }
        }

        return ugly[n - 1];
    }

}