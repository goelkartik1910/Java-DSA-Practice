package Accio;

import java.util.Scanner;

public class SubarraySumsDivisbleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(subarraysDivByK(arr, target));

    }
    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum % k == 0) {
                    count ++;
                }
            }
        }
        return count;
    }
}
