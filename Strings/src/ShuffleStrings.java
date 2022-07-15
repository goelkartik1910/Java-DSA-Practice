public class ShuffleStrings {
    public static void main(String[] args) {

    }

    public String restoreString(String s, int[] indices) {
        char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(indices[i]);
        }
        String ans = new String (a);
        return ans;

    }

}