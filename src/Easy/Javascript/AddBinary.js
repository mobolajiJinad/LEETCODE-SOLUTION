// Problem
// Given two binary strings a and b, return their sum as a binary string.

// Example 1:
// Input: a = "11", b = "1"
// Output: "100"

// Example 2:
// Input: a = "1010", b = "1011"
// Output: "10101"

// Constraints:
// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.

/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function (a, b) {
  let result = "";

  if (a.length > b.length) {
    b = `${"0".repeat(a.length - b.length)}${b}`;
  } else if (b.length > a.length) {
    a = `${"0".repeat(b.length - a.length)}${a}`;
  }

  let carry = 0;
  for (let i = a.length - 1; i >= -1; i--) {
    const current = (Number(a[i]) || 0) + (Number(b[i]) || 0) + carry;

    if (current === 2) {
      result = `${(current - 2).toString()}${result}`;
      carry = 1;
    } else if (current < 2) {
      result = `${current.toString()}${result}`;
      carry = 0;
    } else if (current === 3) {
      result = `${(current - 2).toString()}${result}`;
      carry = 1;
    }
  }

  return Number(result).toString();
};
