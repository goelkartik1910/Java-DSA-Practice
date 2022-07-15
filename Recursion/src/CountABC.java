import java.util.Scanner;

public class CountABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countabc(s));
    }

    public static int countabc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
            return 1 + countabc(str.substring(1));
        }
        else {
            return countabc(str.substring(1));
        }
    }
}
