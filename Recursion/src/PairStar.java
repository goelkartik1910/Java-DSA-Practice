import java.util.*;
import java.lang.*;

public class PairStar
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pairStar(sc.nextLine()));
    }
    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }
}