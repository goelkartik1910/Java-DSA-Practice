package Accio;

import java.util.Scanner;

public class AngryProfessors {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int outerLoop = sc.nextInt();

        for (int x = 0; x < outerLoop; x++){
            int size = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[size];

            int count=0;
            for(int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > 0){
                    count++;
                }
            }

            if ((size - count) >= k){
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }
        }
    }
}
