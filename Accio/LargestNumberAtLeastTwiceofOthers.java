package Accio;

import java.util.Scanner;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        int flag = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIndex] < 2 * arr[i] && i != maxIndex) {
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println(maxIndex);
        }else{
            System.out.println(-1);
        }



    }
}
