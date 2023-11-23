

public class CaseDiscount {
    public static void main(String[] args) {
        int price = 1000;
        System.out.println(caseDiscount(price));
    }

    public static int caseDiscount(int price) {

        int dis = 100; // 초기 할인율은 100% (할인 없음)

        if (price >= 500000) {
            dis = 80;
        } else if (price >= 300000) {
            dis = 90;
        } else if (price >= 100000) {
            dis = 95;
        }

        return price * dis / 100;
    }
}