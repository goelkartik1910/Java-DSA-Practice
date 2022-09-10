package Accio;

import java.util.Scanner;

public class NumberofDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1, 3, 5, 8, 7, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(28);
            case 4, 6, 9, 11 -> System.out.println(30);
        }
    }
}