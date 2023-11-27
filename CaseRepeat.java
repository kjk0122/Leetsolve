
public class CaseRepeat {
    public static void main(String[] args) {
        String my_string="wewe";
        int n = 2;
        System.out.println(caseRepeat(my_string,n));
    }

    public static String caseRepeat(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
        String x= String.valueOf(my_string.charAt(i));
        x=x.repeat(n);
        sb.append(x);
        }
        return sb.toString();
    }
}