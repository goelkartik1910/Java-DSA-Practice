// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

public class MatchingRule {
    public static void main(String[] args) {

    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int checkIndex = 0;
        if (ruleKey.equals("type")){
            checkIndex = 0;
        }
        else if(ruleKey.equals("color")){
            checkIndex = 1;
        }
        else{
            checkIndex = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(checkIndex).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}

