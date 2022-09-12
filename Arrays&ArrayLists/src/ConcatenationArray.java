package Arrays_ArrayListss;

public class ConcatenationArray{
    public static void main(String[] args) {

    }
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < ans.length/2;  i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
