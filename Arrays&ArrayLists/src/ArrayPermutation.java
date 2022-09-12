package Arrays_ArrayListss;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        int[] ans = buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

     static int[] buildArray(int[] nums) {
        int[]ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
             ans[i] = nums[nums[i]];
        }
        return ans;
    }
}