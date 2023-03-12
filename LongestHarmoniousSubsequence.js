// Problem
// We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
// Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
// A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

/**
 * @param {number[]} nums
 * @return {number}
 */
function findLHS(nums) {
  let freq = new Map();
  let max_length = 0;

  // Count the frequency of each number
  for (let num of nums) {
    freq.set(num, (freq.get(num) || 0) + 1);
  }

  // Check for harmonious subsequences
  for (let [key, value] of freq) {
    if (freq.has(key + 1)) {
      let length = value + freq.get(key + 1);
      max_length = Math.max(max_length, length);
    }
  }

  return max_length;
}
