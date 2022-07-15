public class OddValueMatrix {
    public static void main(String[] args) {

    }

    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                int row = indices[i][0];
                matrix[row][j] = matrix[row][j] + 1;
            }
            for (int j = 0; j < m; j++) {
                int col = indices[i][1];
                matrix[j][col] = matrix[j][col] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;

    }

}
