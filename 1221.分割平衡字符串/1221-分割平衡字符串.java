class Solution {
    /**
     * count
     */
    public int balancedStringSplit(String s) {
        int result = 0, l = 0, r = 0;
        for (char c : s.toCharArray()) {
            if ('L' == c) {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                l = 0;
                r = 0;
                result ++;
            }
        }
        return result;
    }
}