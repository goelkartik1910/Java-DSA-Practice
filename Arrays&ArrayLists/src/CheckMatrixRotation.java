package Arrays_ArrayListss;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class CheckMatrixRotation {
    public static void main(String[] args) {

    }
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = false;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(target[i][j] == mat[n - j - 1][i]){
                    flag = true;
                }
                else{
                    break;
                }
            }
        }
        return flag;
    }

    public static class InreasingTriplet {
        public static void main(String[] args) {

        }
        public boolean increasingTriplet(int[] nums) {

            int min = nums[0];
            int seq = Integer.MAX_VALUE;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] < min){
                    min = nums[i];
                }
                else if (nums[i] > min && nums[i] < seq){
                    seq = nums[i];
                }
                else if (nums[i] > seq){
                    return true;
                }
            }
            return false;
        }
    }

    public static class BestTimetoBuyStock {
        public static void main(String[] args) {

        }
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int buy = prices[0];

            for (int i = 1; i < prices.length; i++) {
                if(prices[i] < buy){
                    buy = prices[i];
                } else if (prices[i] - buy > maxProfit) {
                    maxProfit = prices[i] - buy;
                }
            }
            return maxProfit;
        }
    }
}
