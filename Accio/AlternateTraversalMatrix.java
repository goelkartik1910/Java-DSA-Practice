package Accio;

import java.util.Scanner;

public class AlternateTraversalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }else{
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }

        }
    }
}
