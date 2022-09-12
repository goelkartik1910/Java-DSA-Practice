package Arrays_ArrayListss;//https://leetcode.com/problems/find-the-highest-altitude/

public class HighestAltitude {
    public static void main(String[] args) {

    }
    public int largestAltitude(int[] gain) {
        int[] trip = new int [gain.length + 1];
        int maxGain = 0;

        for (int i = 0; i < gain.length; i++) {
            trip[i+1] = trip[i] + gain[i];
            if(trip[i+1] > maxGain){
                maxGain = trip[i+1];
            }
        }

        return maxGain;
    }
}
