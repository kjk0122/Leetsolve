public class RecursionPractice {
    public static void main(String[] args) {
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void HelloWorld(int n) {// HelloWorld 출력 메서드 선언
        // n이 0인 경우 return
        if (n == 0)
            return;

        System.out.println("HelloWorld"); // HelloWorld 출력
        HelloWorld(n - 1); // 재귀함수 시작
    }

    public static int PlusPlus(int n) // PlusPlus 출력 메서드 선언
    {
        // n이 0인 경우 return
        if (n == 0)
            return 0;

        return n += PlusPlus(n - 1); // 재귀함수 시작
    }
    public static int ArraySort(int[] a, int n)// 크기가 N인 경우 최대값을 가져오는 메서드 선언
    {
        int x;
        if(n == 1)
            return a[0];
        else
            x = ArraySort(a, n - 1);

        return Math.max(x, a[n - 1]);
    }

}