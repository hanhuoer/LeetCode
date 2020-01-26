class Solution {
    /**
     *
     */
    public int[] diStringMatch(String S) {
        int len = S.length();
        int i = 0;
        int d = len;
        int[] result = new int[len+1];
        for (int j = 0; j < len; j++) {
            if ('I' == S.charAt(j)) {
                result[j] = i++;
            } else {
                result[j] = d--;
            }
        }
        result[len] = d;
        return result;
    }
}