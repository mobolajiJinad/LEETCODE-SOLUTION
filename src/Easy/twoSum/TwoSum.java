//Problem
//
//  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.
//  You can return the answer in any order.

package Easy.twoSum;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0; int b = 0;

        label:
        for(int x = 0; x < nums.length; x++) {
            for(int y = (x + 1); y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    a = x;
                    b = y;
                    break label;
                }
            }

        }

        return new int[]{a, b};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        //test cases
        System.out.println(Arrays.toString(solution.twoSum(new int[]{10,15,20,25}, 45)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,3}, 6)));
    }
}
