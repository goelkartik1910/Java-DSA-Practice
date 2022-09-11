package Accio;

import java.util.Scanner;

public class SortedInsertedPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int ans = 0;
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                ans = i;
                flag = 1;
                break;
            }else if (target < arr[i]){
                ans = i;
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println(ans);
        }else{
            System.out.println(size);
        }

    }
}
