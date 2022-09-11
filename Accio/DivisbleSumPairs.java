package Accio;

import java.util.Scanner;

public class DivisbleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if((arr[i] + arr[j]) % k == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
