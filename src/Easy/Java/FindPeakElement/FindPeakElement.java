package Easy.Java.FindPeakElement;

//Problem
// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.

/**
 * FindPeakElement
 */
class Solution {
  public int findPeakElement(int[] nums) {
    int peakIndex = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums.length == 1) {
        peakIndex = 0;
      } else {
        if (i == 0) {
          if (nums[i] > nums[i + 1]) {
            peakIndex = i;
          } else {
            continue;
          }
        } else if (i == (nums.length - 1)) {
          if (nums[i] > nums[i - 1]) {
            peakIndex = i;
          } else {
            continue;
          }
        } else {
          if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
            peakIndex = i;
          } else {
            continue;
          }
        }
      }

    }

    return peakIndex;
  }
}

/**
 * FindPeakElement
 */
public class FindPeakElement {
  public static void main(String[] args) {
    Solution solution = new Solution();

    System.out.println(solution.findPeakElement(new int[] { 1, 2, 3, 1 }));
    System.out.println(solution.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
  }
}