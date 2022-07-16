public class ReshapeMatrix {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[r][c];

        if(row * col != r*c){
            return mat;
        }

        int rowStart = 0;
        int colStart = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                ans[rowStart][colStart] = mat[i][j];
                colStart++;

                if(colStart==c){
                    colStart = 0;
                    rowStart++;
                }
            }
        }

        return ans;
    }
}
