package Arrays_ArrayListss;

public class FIrstAndLastNumber {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = findElement(nums, target, true);
        if (ans[0] != -1){
            ans[1] = findElement(nums, target, false);
        }

        return ans;
    }

    public static int findElement(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            }else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = start + 1;
                }
            }
        }
        return ans;
    }
}
