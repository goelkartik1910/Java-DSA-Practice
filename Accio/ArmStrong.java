package Accio;

import javax.swing.*;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        for (int i = 1; i < 500; i++) {
            if(checkArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean checkArmstrong(int a){
        int temp = a;
        int digitSum = 0;
        while (a != 0){
            int rem = a % 10;
            digitSum = (rem * rem * rem) + digitSum;
            a = a / 10;
        }
        return digitSum == temp;
    }
}
