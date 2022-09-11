package Accio;

import java.util.Scanner;

public class MarcCakewalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0;i < size - 1;i++){
            for  (int j = i+1;j < size; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        long miles = 0;
        for(int i = 0; i < size; i++){
            miles = miles + (arr[i] * (long)Math.pow(2,i));
        }
        System.out.println(miles);
    }
}
