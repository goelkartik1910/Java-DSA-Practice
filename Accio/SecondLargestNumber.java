package Accio;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int ans = 0;
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                ans = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax && ans != i){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
