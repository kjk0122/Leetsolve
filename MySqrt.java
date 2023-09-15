public class MySqrt {
    public static void main(String[] args) {
        int x = 25;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int i = 1;
        int ii = 1;
        while (ii < x) {
            i++;
            ii = i * i;
        }
        if (ii == x) {
            return i;
        } else {
            return i-1;
        }
    }
}