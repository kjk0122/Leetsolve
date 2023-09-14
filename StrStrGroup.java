public class StrStrGroup {
    public static void main(String args[]) {
        String strValue = "Subject: Java, JavaScript, React, Node.JS";

        int findIndex = strValue.indexOf("Java");

        while (findIndex >= 0) {
            System.out.println("문자열 \"Java\"의 위치: " + findIndex);
            findIndex = strValue.indexOf("Java", findIndex + 1);
        }
    }
}