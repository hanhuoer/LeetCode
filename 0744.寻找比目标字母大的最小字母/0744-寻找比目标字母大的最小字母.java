class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length, low = 0, high = len;
        while (low < high) {
            int mid = (high + low) >> 1;
            if (letters[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return letters[low % len];
    }
}