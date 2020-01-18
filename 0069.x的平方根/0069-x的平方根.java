class Solution {
    public int mySqrt(int x) {
        long low = 0, high = (x >> 1) + 1;
        while (low < high) {
            long mid = (low + high + 1) >> 1;
            if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return (int) low;
    }
}