package Arrays_ArrayListss;

import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList <Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] >= max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = ans.size() - 1; i >= 0; i--) {
            revArrayList.add(ans.get(i));
        }

        return revArrayList;
    }
}
