import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;
public class Calend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String startDay = scanner.nextLine(); // 2023년 1월 1일의 요일 (예: "MON")
        int holidayCount = Integer.parseInt(scanner.nextLine()); // 공휴일의 개수
        HashMap<String, Integer> holidays = new HashMap<>();
        for (int i = 0; i < holidayCount; i++) {
            String[] holiday = scanner.nextLine().split(" ");
            holidays.put(holiday[0] + " " + holiday[1], 1);
        }
        int salaryDay = Integer.parseInt(scanner.nextLine()); // 매월 월급날 Y

        // 요일 매핑
        HashMap<String, Integer> daysMap = new HashMap<>();
        daysMap.put("MON", 0);
        daysMap.put("TUE", 1);
        daysMap.put("WED", 2);
        daysMap.put("THU", 3);
        daysMap.put("FRI", 4);
        daysMap.put("SAT", 5);
        daysMap.put("SUN", 6);

        // 날짜 계산
        for (int month = 1; month <= 12; month++) {
            Calendar cal = Calendar.getInstance();
            cal.set(2023, month - 1, 1);
            int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            int salaryDate = 0;

            for (int i = 1; i <= maxDay; i++) {
                cal.set(2023, month - 1, i);
                int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;

                if (cal.get(Calendar.DAY_OF_WEEK) == daysMap.get(startDay) + 1 && i < salaryDay) {
                    salaryDate = i;
                }
            }

            if (holidays.containsKey(month + " 1")) {
                if (daysMap.get(startDay) == 5) {
                    salaryDate--;
                } else if (daysMap.get(startDay) == 6) {
                    salaryDate++;
                }
            }

            if (salaryDate == 0) {
                salaryDate = maxDay;
            }

            System.out.println(month + " " + salaryDate);
        }
    }
}