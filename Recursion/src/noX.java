import java.util.Arrays;
import java.util.Scanner;

public class noX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(noX(sc.nextLine()));
    }
    public static String noX(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }
}
