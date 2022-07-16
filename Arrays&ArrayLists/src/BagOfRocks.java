import java.util.Arrays;

public class BagOfRocks {
    public static void main(String[] args) {

    }

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i < capacity.length; i++) {
            capacity[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(capacity);
        int count = 0;
        for (int i = 0; i < capacity.length; i++) {
            if (additionalRocks >= capacity[i]) {
                count++;
                additionalRocks = additionalRocks - capacity[i];
            }
            else{
                break;
            }
        }
        return count;
    }
}
