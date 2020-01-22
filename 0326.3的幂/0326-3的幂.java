class Solution {
    /**
     * 抠 int 的最大范围内 3 的最大次幂值 1162261467
     */
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}