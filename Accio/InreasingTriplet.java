package Accio;

public class InreasingTriplet {
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
