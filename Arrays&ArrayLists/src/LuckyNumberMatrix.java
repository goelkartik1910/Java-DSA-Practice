package Arrays_ArrayListss;//https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {
    public static void main(String[] args) {

    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> List = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            temp = min;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            if (temp == max) {
                List.add(max);
            }
        }
        return List;
    }
}
