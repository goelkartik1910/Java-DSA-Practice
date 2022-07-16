import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddToArray {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr, 1));
    }
    public static List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> List = new ArrayList<>();
        int n = nums.length;
        int i = n - 1;
        while(i >= 0 || k > 0) {
            if (i >= 0) {
                List.add((nums[i] + k) % 10);
                k = (nums[i] + k) / 10;
            }
            else{
                List.add(k % 10);
                k /= 10;
            }
            i--;
        }
        Collections.reverse(List);
        return List;
    }
}
