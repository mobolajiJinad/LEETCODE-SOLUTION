// Problem
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (nums1, nums2) {
  const sortedArray = Array.prototype
    .concat(nums1, nums2)
    .sort((a, b) => a - b);

  let ans;
  if (sortedArray.length % 2 === 0) {
    const sumMiddleNum =
      sortedArray[sortedArray.length / 2 - 1] +
      sortedArray[sortedArray.length / 2];

    ans = sumMiddleNum / 2;
  } else {
    ans = sortedArray[Math.floor(sortedArray.length / 2)];
  }

  return ans;
};
