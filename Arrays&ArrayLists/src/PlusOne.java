import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int []array = {9};
        System.out.println(Arrays.toString(plusOne(array)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int []ans = new int[n+1];
        ans[0]=1;
        return ans;
    }
}
