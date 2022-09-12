package Accio;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(timeConversion(str));
    }
    static String timeConversion(String s){
        String ans = "";
        int hour = Integer.valueOf(s.substring(0, 2));
        if(s.charAt(8) == 'A'){
            if (hour == 12){
                ans = "00" + s.substring(2, 8);
            }else{
                ans = s.substring(0, 8);
            }
        } else if (s.charAt(8) == 'P') {
            if (hour == 12){
                ans = s.substring(0, 8);
            }else{
                hour = 12 + hour;
                String hourStr = Integer.toString(hour);
                ans = hourStr + s.substring(2, 8);
            }
        }
        return ans;
    }
}
