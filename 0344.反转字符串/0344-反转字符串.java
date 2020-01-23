class Solution {
    /**
     * ˫ָ�룬����һ��ָ���λ����һ��ָ���λ
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