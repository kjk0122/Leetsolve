import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MapPractice {
    public static final String REGEXP_PATTERN_NO_CHAR = "^[a-zA-Z]*$";

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

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 단어 검색");
            System.out.println("2. 새로운 단어 추가");
            System.out.println("3. 전체 사전 출력");
            System.out.println("4. 프로그램 종료");

            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("영어 단어를 입력하세요: ");
                    String inputWord = scanner.nextLine();
                    dictionary(glossary, inputWord);
                    break;
                case 2:
                    System.out.print("새로운 영어 단어를 입력하세요: ");
                    String newWord = scanner.nextLine();
                    boolean isEnglishCheck = Pattern.matches(REGEXP_PATTERN_NO_CHAR, newWord);
                    if(isEnglishCheck) {
                        System.out.print("단어의 뜻을 입력하세요: ");
                        String meaning = scanner.nextLine();
                        glossary.put(newWord, meaning);
                        System.out.println("새로운 단어가 사전에 추가되었습니다.");
                    }else{
                        System.out.println("영어단어가 아닙니다. 초기선택으로 돌아갑니다.");
                    }
                    break;
                case 3:
                    System.out.println("전체 사전: " + glossary);
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }

    public static void dictionary(Map<String, String> h, String x) throws IllegalArgumentException {
        if (h.containsKey(x)) {
            System.out.println("해당 단어의 뜻: " + h.get(x));
        } else {
            System.out.println("사전에 존재하지 않는 단어입니다.");
        }
    }
}
