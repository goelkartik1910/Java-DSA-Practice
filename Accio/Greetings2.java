package Accio;

import java.util.Scanner;

public class Greetings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String newStr = "";

        newStr = Str.charAt(0) + Str.substring(1, Str.length() - 1) + Str.substring(1, Str.length() - 1) +Str.charAt(Str.length() - 1);
        System.out.println(newStr);
    }
}
