// Problem
// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"
// Write the code that will take a string and make this conversion given a number of rows:
// string convert(string s, int numRows);

/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function (s, numRows) {
  if (numRows === 1) return s;

  const rows = Array(numRows).fill("");
  let index = 0;
  let direction = 1;

  for (let i = 0; i < s.length; i++) {
    rows[index] += s[i];
    if (index === 0) {
      direction = 1;
    } else if (index === numRows - 1) {
      direction = -1;
    }
    index += direction;
  }

  return rows.join("");
};
