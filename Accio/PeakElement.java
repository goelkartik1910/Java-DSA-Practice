package Accio;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println(i);
                    break;
                }
            } else if (i < (size - 1)) {
                if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                    System.out.println(i);
                    break;
                }
            } else if (arr[i - 1] < arr[i] && i == (size - 1)) {
                System.out.println(i);
                break;
            }
        }
    }
}
