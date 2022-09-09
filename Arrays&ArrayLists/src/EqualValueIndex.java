import javax.management.InstanceNotFoundException;
import java.lang.reflect.Type;
import java.util.*;
import java.lang.*;
import java.io.*;

public class EqualValueIndex
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        checkMatch(nums);
    }

    public static void checkMatch(int[] nums) {
        ArrayList<Integer> List = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(i == nums[i]){
                List.add(i);
            }
        }
        if (List.size() == 0){
            List.add(-1);
        }
        Collections.sort(List);
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " ");
        }
    }
}