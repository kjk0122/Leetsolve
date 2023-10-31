
public class JDa {

    public static void main(String[] args) {
            int X = 7;
    //        solution1(X);
            int[][] H = {{1, 1}, {1, 21}, {1, 22}, {1, 23}, {3, 1}, {5, 5}, {5, 27}, {6, 6}, {8, 15}, {9, 28}, {9, 29}, {9, 30}, {10, 3}, {10, 9}, {12, 25}};
//        System.out.println(solution2(X, H));
        int Y = 5;
        System.out.println(solution4(X, H, Y));
    }

    public static int solution1(int X) {
        //월,화,수,목,금,토,일

        int[] holiday = {104, 104, 104, 104, 104, 105, 105};

        return holiday[X - 1];
    }

    public static int solution2(int X, int[][] H) {
        //월,화,수,목,금,토,일
        int[] holiday = {104, 104, 104, 104, 104, 105, 105};
        int[] month = {0, 31, 59,
                90, 120, 151,
                181, 212, 243,
                273, 304, 334};
        int count = 0;
//      {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int[] ints : H) {
            int n = month[ints[0] - 1] + ints[1] + X - 1;
            //1월 1일이 월요일이면 0+1+1-1=1로 만들어준다.
            //이것을 7로 나누어서 6,0이 아니면 count해준다.
            if (n % 7 != 6 && n % 7 != 0) {
                count++;
            }
        }
        return holiday[X - 1] + count;
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
            month[i] = month[i]+Y+X-1;
            //1월 5일이 월급이면 5,36,64...
            //1월 1일이 월요일이고 5일 기준이면 5가 되게 하기 위해 0+5+1-1

            //이것을 7로 나누어서 6,0이 아니면 count해준다.
            if (month[i] % 7 == 6) {
                payday[i]=Y-1;
            } else if (month[i] % 7 == 0) {
                payday[i]=Y+1;
            } else{
                payday[i]=Y;
            }
        }
        return payday;
    }
}
