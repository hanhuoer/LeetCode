class Solution {
    /**
     * 二分
     * 由于给定 nums 是排过序的，所以可以直接使用二分查找
     * 先找到第一个目标 (start)，接下来很容易就能找到最后一个目标 (end)
     */
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length, low = 0, high = len - 1;
        if (nums.length == 1 && nums[0] == target) {
            return new int[] {0, 0};
        }
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (target == nums[mid]) {
                int end = mid;
                // find end
                while (++end < len && target == nums[end]) {}
                int start = end;
                // find start
                while (--start >= 0 && target == nums[start]) {}
                return new int[] {start + 1, end - 1};
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] {-1, -1};
    }
}