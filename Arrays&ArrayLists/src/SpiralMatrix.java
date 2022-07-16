import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {
    public static void main(String[] args) {

    }
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            // Define a new arraylist for storing answers
            List<Integer> spiral = new ArrayList<Integer>();
            // define all the direction and size variables
            int row = matrix.length;
            int col = matrix[0].length;
            int left = 0, right = col - 1, top = 0, bottom = row - 1, d = 0;

            // while we are inside the matrix
            while(top <= bottom && left <= right){
                // d == 0; moving left to right
                if( d == 0){
                    for(int i = left ; i <= right; i++){
                        spiral.add(matrix[top][i]);
                    }
                    //after adding the value, change the direction and remove the added row/column
                    d = 1;top++;
                }
                // d == 1; moving top to bottom
                else if( d == 1){
                    for(int i = top; i <= bottom; i++){
                        spiral.add(matrix[i][right]);
                    }
                    d = 2;right--;
                }
                // d == 2; moving right to left
                else if(d == 2){
                    for(int i = right; i >= left; i--){
                        spiral.add(matrix[bottom][i]);
                    }
                    d = 3;bottom--;
                }
                // d == 1; moving bottom to top
                else if( d == 3){
                    for(int i = bottom; i >= top; i--){
                        spiral.add(matrix[i][left]);
                    }
                    d = 0;left++;
                }
            }


            return spiral;
        }
    }
}
