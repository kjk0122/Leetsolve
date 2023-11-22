
public class ChickenCoupon {
    public static void main(String[] args) {
    System.out.println(cc(100));
    }
    public static int cc(int chicken) {
        int answer=0;
        while(chicken>=10){
            answer+=chicken/10;
            chicken=(chicken/10)+(chicken%10);
        }
        return answer;
    }
}