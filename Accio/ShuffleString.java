package Accio;

import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();
        int[] indices = new int[size];
        char[] ans = new char[size];

        for (int i = 0; i < indices.length; i++) {
            indices[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        String newAns = new String(ans);
        System.out.println(newAns);
    }
}
