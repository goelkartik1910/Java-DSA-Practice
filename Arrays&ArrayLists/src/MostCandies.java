package Arrays_ArrayListss;

import java.util.ArrayList;
import java.util.List;

public class MostCandies {
    public static void main(String[] args) {

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Integer.MIN_VALUE;
        List<Boolean> arr = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= maxCandies){
                arr.add(true);
            }else{
                arr.add(false);
            }
        }
        return arr;

    }
}
