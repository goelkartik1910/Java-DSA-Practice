package Arrays_ArrayListss;

public class Pangram {
    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) {
            return false;
        }

        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < 26; i++){
            int j = sentence.indexOf(alphabets.charAt(i));
            if(j == -1){
                return false;
            }
        }

        return true;
    }
}
