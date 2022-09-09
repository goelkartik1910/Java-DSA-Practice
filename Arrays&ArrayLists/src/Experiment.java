import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
//        int[] arr = {18,43,36,13,7};
//        System.out.println(Arrays.toString(new int[]{maximumSum(arr)}));
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String stn = sc.nextLine();
//        char C = sc.nextLine().charAt(0);
//
//        int ansIndex = -1;
//        for(int i = 0; i < N; i++){
//            if(stn.charAt(i) == C){
//                ansIndex = i;
//                break;
//            }
//        }
//        System.out.println(ansIndex);
    }
//    public static int[] numberOfPairs(int[] nums) {
//        ArrayList <Integer> List = new ArrayList<>();
//        int countpair = 0;
//        int[] ans = new int[2];
//
//        for (int num : nums) {
//            List.add(num);
//        }
//
//
//        for (int i = 0; i < List.size(); i++) {
//            for (int j = i + 1; j < List.size(); j++) {
//                if (Objects.equals(List.get(i), List.get(j))) {
//                    countpair++;
//                    List.remove(j);
//                    List.remove(i);
//                }
//            }
//        }
//        ans[0] = countpair;
//        ans[1] = List.size();
//
//        return ans;
//    }
//
//    public int maxIceCream(int[] costs, int coins) {
//        Arrays.sort(costs);
//        int maxSum = 0;
//        int count = 0;
//        for (int i = 0; i < costs.length; i++) {
//            maxSum = maxSum + costs[i];
//            if(maxSum <= coins){
//                count++;
//            }else{
//                break;
//            }
//        }
//
//        return count;
//    }
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    int ans = 0;
    while (x != 0){
        int rem = x % 10;
        ans = ans * 10 + rem;
        x = x / 10;
    }
    System.out.println(ans);

}
