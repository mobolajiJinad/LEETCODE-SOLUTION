// Problem
// Given a string s, return the longest palindromic substring in s.

/**
 * @param {string} s
 * @return {string}
 */
function longestPalindrome(s) {
  let longest = "";
  for (let i = 0; i < s.length; i++) {
    // check palindromes with odd length
    let left = i;
    let right = i;
    while (left >= 0 && right < s.length && s[left] === s[right]) {
      let palindrome = s.substring(left, right + 1);
      if (palindrome.length > longest.length) {
        longest = palindrome;
      }
      left--;
      right++;
    }
    // check palindromes with even length
    left = i;
    right = i + 1;
    while (left >= 0 && right < s.length && s[left] === s[right]) {
      let palindrome = s.substring(left, right + 1);
      if (palindrome.length > longest.length) {
        longest = palindrome;
      }
      left--;
      right++;
    }
  }
  return longest;
}
