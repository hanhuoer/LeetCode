class Solution {
    /**
     * 1. int -> string
     * 2. string.length
     */
    public int findNumbers(int[] nums) {
        int c = 0;
        for (Integer n: nums) {
            String s = new String(n.toString());
            if (s.length() % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}