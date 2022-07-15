import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println(array11(arr, size));
    }

    public static int array11(int[] arr, int index) {
        if (arr.length == index) {
            return 0;
        }
        if(arr[index] == 11){
            return 1 + array11(arr, index + 1);
        }
        return array11(arr, index + 1);
    }
}
