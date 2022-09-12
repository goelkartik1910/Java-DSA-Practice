package Arrays_ArrayListss;

import java.util.Arrays;

//https://leetcode.com/problems/largest-number/
public class LargestNumber {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        String ans = Arrays.toString(nums);
        char[] arr = ans.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}
