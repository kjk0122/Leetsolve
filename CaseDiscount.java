import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CaseDiscount {
    public static void main(String[] args) {
        int price = 1000;
        int[] num_list={3,41,4,4,2,23,23,4,23,3};
        System.out.println(caseDiscount(price));

        System.out.println(Arrays.toString(solution2(num_list)));
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

    public static int[] solution2(int[] num_list) {
        // 배열을 리스트로 변환
        List<Integer> list = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());

        // 리스트를 뒤집음
        Collections.reverse(list);

        // 리스트를 배열로 변환
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
    public String solution3(String my_string) {
        // StringBuilder를 사용하여 문자열 뒤집기
        StringBuilder reversed = new StringBuilder(my_string).reverse();

        return String.valueOf(reversed);
    }
}