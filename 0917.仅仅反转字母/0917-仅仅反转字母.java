class Solution {
    /**
     * Ë«Ö¸Õë
     */
    public String reverseOnlyLetters(String S) {
        int low = 0, high = S.length() - 1;
        char[] chars = S.toCharArray();
        while(low < high) {
            char l = chars[low];
            char h = chars[high];
            if (!isLetter(l)) {
                low++;
            } else if (!isLetter(h)) {
                high--;
            } else {
                char tmp = chars[low];
                chars[low++] = chars[high];
                chars[high--] = tmp;
            }
        }
        return new String(chars);
    }

    public boolean isLetter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}