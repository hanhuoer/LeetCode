class Solution {
    public int arrangeCoins(int n) {
        // 1. ±©Á¦
        // int l = 0, s = 0;
        // while (true) {
            // ++ l;
            // s += l;
            // if (s > n) {
                // return l - 1;
            // }
        // }
        
        long low = 0, high = n;
        while (low < high) {
            long mid = (low + high + 1) >> 1;
            if (mid * (mid + 1) >> 1 > n) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return (int) high;
    }
}