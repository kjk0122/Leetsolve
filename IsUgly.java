public class IsUgly {
    public static void main(String[] args) {
        int k=22323;
        System.out.println(isUgly(k));
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
            for (int prime : new int[] {2, 3, 5}) //이런 형태의 for문은 본 적이 없다...매우 신기
                while (n % prime == 0)
                    n /= prime;
            return n == 1;
        }

}