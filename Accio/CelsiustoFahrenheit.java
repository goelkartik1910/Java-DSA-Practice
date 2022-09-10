package Accio;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int f=(9*a/5) + 32;
        System.out.print(f);
        //your code here
    }
}
