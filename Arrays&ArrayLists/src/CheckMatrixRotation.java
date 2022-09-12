package Arrays_ArrayListss;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class CheckMatrixRotation {
    public static void main(String[] args) {

    }
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = false;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(target[i][j] == mat[n - j - 1][i]){
                    flag = true;
                }
                else{
                    break;
                }
            }
        }
        return flag;
    }
}
