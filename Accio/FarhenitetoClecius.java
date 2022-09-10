package Accio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FarhenitetoClecius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int F = input.nextInt();
        System.out.println((F-32)*5/9);
    }
}
