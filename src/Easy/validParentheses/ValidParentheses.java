//Problem
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//  An input string is valid if:
//  Open brackets must be closed by the same type of brackets.
//  Open brackets must be closed in the correct order.
//  Every close bracket has a corresponding open bracket of the same type.

package Easy.validParentheses;

import java.util.Map;

class Solution {
    Map<Character, Character> hash = Map.of('(', ')', '[', ']', '{', '}');

    public boolean isValid(String s) {
        boolean p = true;

        if((s.length() % 2) != 0) p = false;
        else {
            for(int x = 0; x < s.length() - 1; x += 2) {
                p = ((hash.get(s.charAt(x)) != null) && hash.get(s.charAt(x)).equals(s.charAt(x + 1)));

                if(!p) break;
            }
        }
        return p;
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //test cases
        System.out.println(solution.isValid("{([)]}"));
        System.out.println(solution.isValid("{}[]"));
    }
}
