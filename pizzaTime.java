public class pizzaTime {
    public static void main(String[] args) {
        int n = 1;
        int m=10;
        int slice=7; int k=10;
        System.out.println(solution(n));
        System.out.println(solution2(m));
        System.out.println(solution3(slice,k));
    }

    public static int solution(int n) {
        if(n%7==0){
            return n/7;}
        else {
            return (n/7)+1;
        }
    }

    public static int solution2(int n) {
        if(n%2==0)n/=2;
        if(n%3==0)n/=3;
        return n;
    }
    public static int solution3(int slice, int n) {
        if(n%slice==0){
            return n/slice;}
        else {
            return (n/slice)+1;
        }
    }

}