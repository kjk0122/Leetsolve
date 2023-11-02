import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, String> glossary = new HashMap<>();
        // 요소 추가
        glossary.put("One", "일");
        glossary.put("Two", "이");
        glossary.put("Three", "삼");
        glossary.put("apple", "사과");
        glossary.put("banana", "바나나");
        glossary.put("cherry", "체리");
        glossary.put("date", "데이트");
        glossary.put("grape", "포도");
        // 사용자로부터 단어를 입력받습니다.
        Scanner scanner = new Scanner(System.in);
        System.out.print("영어 단어를 입력하세요: ");
        String inputWord = scanner.nextLine();
        dictionary(glossary,inputWord);
        scanner.close();
    }

    public static void dictionary(Map<String,String> h, String x){
        if (h.containsKey(x)) {
            System.out.println("해당 단어의 뜻: " + h.get(x));
        } else {
            System.out.println("사전에 존재하지 않는 단어입니다.");
        }
    }
}