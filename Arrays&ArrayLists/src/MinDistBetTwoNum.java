package Arrays_ArrayListss;

public class MinDistBetTwoNum {
    public static void main(String[] args) {

    }
    int minDist(int a[], int n, int x, int y) {
        int xIndex = -1;
        int yIndex = -1;
        int dist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(a[i] == x){
                xIndex = i;
            } else if(a[i] == y){
                yIndex = i;
            }
            if(xIndex != -1 && yIndex != -1){
                dist = Math.min(dist, Math.abs(xIndex - yIndex));
            }
        }

        if(xIndex == -1 || yIndex == -1){
            return -1;
        }else{
            return dist;
        }
    }
}
