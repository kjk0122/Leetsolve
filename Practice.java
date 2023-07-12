public class Practice {
    public static void main(String[] args) {
        String code = "public class Main {\n  // 주석입니다.\n  public static void main(String[] args) {\n    System.out.println(\"Hello, World!\"); // 출력합니다.\n  }\n}";

        String result = removeComments(code);
        System.out.println(result);
    }

    public static String removeComments(String code) {
        return code.replaceAll("//.*|/\\*(.|\\R)*?\\*/", "");
    }



}