/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int f = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[f++] = num;
            }
        }

        while (f < nums.length) {
            nums[f++] = 0;
        }

    }
}

