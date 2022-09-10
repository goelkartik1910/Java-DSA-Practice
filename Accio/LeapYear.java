package Accio;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int ans;
        if (year % 400 == 0) {
            ans = 1;
        } else if (year % 100 == 0) {
            ans = 0;
        } else if (year % 4 == 0) {
            ans = 1;
        } else {
            ans = 0;
        }
        System.out.println(ans);
    }
}
