package Accio;

import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        char[] Adrian = {'A','B','C'};
        char[] Bruno = {'B','A','B','C'};
        char[] Goran = {'C','C','A','A','B','B'};

        int AdrianScore = 0;
        int BrunoScore = 0;
        int GoranScore = 0;

        for (int i = 0; i < size; i++) {
            if (Adrian[i % 3] == arr[i]) {
                AdrianScore++;
            }
            if (Bruno[i % 4] == arr[i]) {
                BrunoScore++;
            }
            if (Goran[i % 6] == arr[i]) {
                GoranScore++;
            }
        }

        int maxScore = Math.max(AdrianScore, Math.max(BrunoScore, GoranScore));
        System.out.println(maxScore);

        if (AdrianScore == maxScore) {
            System.out.println("Adrian");
        }
        if (BrunoScore == maxScore) {
            System.out.println("Bruno");
        }
        if (GoranScore == maxScore) {
            System.out.println("Goran");
        }
    }
}
