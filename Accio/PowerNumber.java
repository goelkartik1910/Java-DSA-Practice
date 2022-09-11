package Accio;

import java.util.Scanner;

public class PowerNumber {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        int answer = 1;

        for (int i = 0; i < power; i++){
            answer = num * answer;
        }
        System.out.println(answer);
    }
}
