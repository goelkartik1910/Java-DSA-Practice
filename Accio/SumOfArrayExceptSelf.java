package Accio;

import java.util.Scanner;

public class SumOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0;i < size; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum = arr[j] + sum;
                }
            }
            System.out.print(sum + " ");
        }
    }
}
