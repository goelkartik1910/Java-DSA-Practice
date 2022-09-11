package Accio;

import java.util.Scanner;

public class BooleansMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1){
                    for (int k = 0; k < matrix[i].length; k++) {
                        matrix[i][k] = 1;
                    }
                }
            }
        }
        for(int i = 0;i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
