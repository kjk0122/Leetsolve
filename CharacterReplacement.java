public class CharacterReplacement {
    public static void main(String[] args) {
        String strValue = "Hello_ Java.";
        StringBuilder sb = new StringBuilder(strValue);

        int findIndex = sb.indexOf("_");

        System.out.println("[변경 전]");
        System.out.println(strValue);

        if(findIndex > 0) {
            sb.setCharAt(findIndex, ',');
            strValue = sb.toString();
        }

        System.out.println("\n[변경 후]");
        System.out.println(strValue);
    }

}