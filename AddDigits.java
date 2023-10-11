public class AddDigits {
    public static void main(String[] args) {
        int k=22323;
        System.out.println(args);
        System.out.println(addDigits(k));
    }

    public static int addDigits(int num) {
        while(num >9){
            num = num %10+num /10;
        }
        return num;
    }
}