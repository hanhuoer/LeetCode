public class Solution {
    // you need to treat n as an unsigned value
    /**
     * �����������߼�������
     */
    public int hammingWeight(int n) {
        int c = 0, f = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & f) != 0) {
                c++;
            }
            f <<= 1;
        }
        return c;
    }
}