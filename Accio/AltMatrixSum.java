package Accio;

import java.util.Scanner;

public class AltMatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] arr = new int[m][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int Bsum = 0;
        int Wsum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if((i + j) % 2 == 0){
                    Bsum = Bsum + arr[i][j];
                }else{
                    Wsum = Wsum + arr[i][j];
                }
            }
        }
        System.out.println(Bsum);
        System.out.println(Wsum);
    }
}
