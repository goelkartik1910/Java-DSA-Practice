package Accio;

import java.util.Scanner;

public class SearchingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
    }
}
