//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigitNumbers {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }
//    public static int findNumbers(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            while (nums[i]>0){          // CAN BE REPLACED BY MATH.LOG(num[i]) + 1
//                nums[i] = nums[i]/10;
//                sum++;
//            }
//
//            if (sum % 2 == 0){
//                count++;
//            }
//        }
//        return count;
//    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            if (((int)Math.log10(nums[i]) + 1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
