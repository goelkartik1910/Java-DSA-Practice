package Accio;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] matrix = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
