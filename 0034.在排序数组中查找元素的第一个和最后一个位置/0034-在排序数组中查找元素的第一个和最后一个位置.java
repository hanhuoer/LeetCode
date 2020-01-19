class Solution {
    /**
     * ����
     * ���ڸ��� nums ���Ź���ģ����Կ���ֱ��ʹ�ö��ֲ���
     * ���ҵ���һ��Ŀ�� (start)�������������׾����ҵ����һ��Ŀ�� (end)
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