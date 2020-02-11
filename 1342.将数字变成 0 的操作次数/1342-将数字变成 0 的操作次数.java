class Solution {
    /**
     * 奇数 - 1，偶数 / 2
     */
    public int numberOfSteps (int num) {
        if (num == 0) return 0;
        int count = 0;
        while (num > 0) {
            ++count;
            if (num % 2 == 1) {
                num -= 1;
            } else {
                num = num >> 1;
            }
        }
        return count;
    }
}