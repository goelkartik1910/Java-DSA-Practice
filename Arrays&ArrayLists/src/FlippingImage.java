// https://leetcode.com/problems/flipping-an-image/
public class FlippingImage {
    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] image) {

        int r = image.length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r / 2; j++) {
                int temp = image[i][r - j - 1];     //FLIPPING
                image[i][r - j - 1] = image[i][j];
                image[i][j] = temp;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if(image[i][j] == 0){       //1 to 0 and 0 to 1
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
