//Problem
//Given a roman numeral, convert it to an integer.

package Easy.romanToInteger;

class Solution {
    public int checkValue(char t) {

        return switch (t) {
            case 'M' -> 1_000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
    public int romanToInt(String s) {
        int ans = 0;

        for(int i = 0; i < s.length(); i++) {
            if((i + 1) < s.length()) {
                int currentNum = checkValue(s.charAt(i));
                int nextNum = checkValue(s.charAt(i + 1));

                if(currentNum < nextNum) {
                    ans += (nextNum - currentNum);
                    i += 1;
                } else ans += currentNum;
            } else ans += checkValue(s.charAt(i));
        }

        return ans;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //test cases
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}