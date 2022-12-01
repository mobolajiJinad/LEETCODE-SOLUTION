package Easy.longestCommonPrefix;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();

        Arrays.sort(strs);

        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];

        for(int x = 0; x < firstWord.length(); x++) {
            if(firstWord.charAt(x) == lastWord.charAt(x)) {
                output.append(lastWord.charAt(x));
            } else {
                break;
            }
        }

        return output.toString();
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(solution.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}
