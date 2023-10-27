public class Calend {
    public static void main(String[] args) {
        int k = 7;
        int[][] H = {{1, 1}, {1, 21}, {1, 22}, {1, 23}, {3, 1}, {5, 5}, {5, 27}, {6, 6}, {8, 15}, {9, 28}, {9, 29}, {9, 30}, {10, 3}, {10, 9}, {12, 25}};
        System.out.println(countRest(k,H));
    }

    public static int countRest(int X, int[][] H) {
        int answer=0; int sat=(7-X)%7; int sun=(8-X)%7;
        for(int i=0;i<365;i++){
            int temp=X-1;

        if(temp==sat||temp==sun) answer++;
        }
//        for (int i = 0; i < H.length; i++) {
//
//        }

        return answer;
    }
}