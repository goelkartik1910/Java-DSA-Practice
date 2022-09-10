package Accio;

import java.util.Scanner;
//https://course.acciojob.com/idle?question=80372ff2-d510-4320-8c56-3871c81fcc60
public class BigLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        int dist = h1 - h2;
        int rate = v2 - v1;

        boolean ans;
        if(dist == 0){
            ans = true;
        } else if (rate == 0) {
            ans = false;
        } else if (dist % rate != 0) {
            ans = false;
        }else{
            ans = true;
        }

        System.out.println(ans);
    }
}
