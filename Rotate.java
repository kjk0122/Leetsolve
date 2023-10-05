public class Rotate {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(nums);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 원래 배열의 (i, j) 위치를 새로운 배열의 (j, n-1-i) 위치로 이동
                rotatedMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        // 새로운 배열을 원래 배열에 복사
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotatedMatrix[i][j];
            }
        }
    }

//    public static void rotate(int[][] matrix) {
//        int m = matrix.length; // 원래 행렬의 행 수
//        int n = matrix[0].length; // 원래 행렬의 열 수
//        int[][] rotatedMatrix = new int[n][m]; // 회전된 행렬의 크기는 열 x 행
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                rotatedMatrix[j][m - 1 - i] = matrix[i][j];
//            }
//        }
//
//        // 회전된 결과를 원래 배열에 복사
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = rotatedMatrix[i][j];
//            }
//        }
//    }

}