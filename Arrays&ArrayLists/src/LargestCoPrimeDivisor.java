import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestCoPrimeDivisor
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int i = A;
        int ans = 1;
        while(i > 0){
            if(A % i == 0 && gcd(i, B) == 1){
                ans = i;
            }
            i--;
        }
        System.out.println(ans);
    }

//    public static int gcd (int a, int b){
//        int hcf = 1;
//        for(int i = 1; i < Math.max(a, b); i++){
//            if (a % i == 0 && b % i == 0){
//                hcf = i;
//            }
//        }
//        return hcf;
//    }

    public static int gcd (int a, int b){
        if (a == 0 || b == 0){
            return 0;
        }
        if(a == b){
            return a;
        }
        if(a > b){
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }
}