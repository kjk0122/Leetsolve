
public class Table {

    public static void main(String[] args) {
        int H = 4;
        int W = 7;
        int[] D = {2, 6, 3, 5, 3, 5};
//        System.out.println(solution1(H, W, D));

//        System.out.println(solution2(X, H));
        System.out.println(solution2(H, W, D));
//        System.out.println(solution4(X, H, Y));
    }

    public static int solution1(int H, int W, int[] D) {
        int answer = 0;
        for (int j : D) {
            if (j >= H) answer++;
        }
        return answer;
    }

    public static int solution2(int H, int W, int[] D) {
        int answer = 0;
        int spare = 0;
        for (int i = 0; i < D.length; i++) {
            if (D[i] + spare >= H) {
                answer++;
                spare = H - spare;
            } else {
                spare = 0;
            }
        }
        return answer;
    }

    public static int[] solution4(int X, int[][] H, int Y) {
        //월,화,수,목,금,토,일
        int[] month = {0, 31, 59,
                90, 120, 151,
                181, 212, 243,
                273, 304, 334};
        int[] payday = new int[12];
//      {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < 12; i++) { //ints=H[i]
            month[i] = month[i] + Y + X - 1;
            //1월 5일이 월급이면 5,36,64...
            //1월 1일이 월요일이고 5일 기준이면 5가 되게 하기 위해 0+5+1-1

            //이것을 7로 나누어서 6,0이 아니면 count해준다.
            if (month[i] % 7 == 6) {
                payday[i] = Y - 1;
            } else if (month[i] % 7 == 0) {
                payday[i] = Y + 1;
            } else {
                payday[i] = Y;
            }
        }
        return payday;
    }
}
