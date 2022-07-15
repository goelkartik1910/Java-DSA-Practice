//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class UniqueSumZero {
    public static void main(String[] args) {

    }
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n == 1){
            ans[0] = 0;
        }
        if(n % 2 == 1) {
            for (int i = 1; i < n; i = i + 2) {
                ans[i] = -1 * i;
                ans[i + 1] = i;
            }
        }
        else {
            for (int i = 1; i < n; i = i + 2) {
                ans[i] = -1 * i;
                ans[i + 1] = i;
            }
        }
        return ans;
    }
}
