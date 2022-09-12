package Accio;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";

        newStr = str.substring(0,1);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-'){
                newStr = newStr + str.charAt(i + 1);
            }
        }
        System.out.println(newStr);
    }
}
