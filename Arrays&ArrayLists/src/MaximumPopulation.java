import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/maximum-population-year/
public class MaximumPopulation {
    public static void main(String[] args) {

    }
    public int maximumPopulation(int[][] logs) {
        List<Integer> List = new ArrayList<>();
        int count = 1;
//        List.add();
        for (int i = 1; i < logs.length; i++) {
            if(logs[i][0] < logs[i-1][1]){
                List.add(logs[i-1][0]);
            }
        }
        return List.get(0);
    }
}
