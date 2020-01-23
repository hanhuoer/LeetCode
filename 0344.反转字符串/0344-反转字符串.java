class Solution {
    /**
     * 双指针，其中一个指向低位，另一个指向高位
     */
    public void reverseString(char[] s) {
        int low = 0, high = s.length - 1;
        while (low < high) {
            char tmp = s[low];
            s[low] = s[high];
            s[high] = tmp;
            low ++;
            high --;
        }
    }
}