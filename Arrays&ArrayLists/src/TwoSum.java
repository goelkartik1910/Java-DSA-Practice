//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    ans = new int[]{i, j};
                }
            }
        }
        return ans;
    }
}
