package Easy.Java.PalindromeNumber;

//Problem
//Given an integer x, return true if x is a palindrome, and false otherwise.

/**
 * Solution
 */
class Solution {
  public boolean isPalindrome(int x) {
    String pal = Integer.toString(x);
    StringBuilder indrome = new StringBuilder();

    int y = pal.length() - 1;
    for (; y >= 0; y--) {
      indrome.append(pal.charAt(y));
    }
    return pal.equals(indrome.toString());
  }
}

/**
 * PalindromeNumber
 */
public class PalindromeNumber {
  public static void main(String[] args) {
    Solution solution = new Solution();

    // test cases
    System.out.println(solution.isPalindrome(121));
    System.out.println(solution.isPalindrome(-121));
    System.out.println(solution.isPalindrome(10));
  }
}
