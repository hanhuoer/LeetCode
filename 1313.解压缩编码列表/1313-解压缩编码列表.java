class Solution {
    /**
     * 
     */
    public int[] decompressRLElist(int[] nums) {
        List<Integer> resultList = new LinkedList();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                resultList.add(nums[i + 1]);
            }
        }
        int[] result = new int[resultList.size()];
        int index = 0;
        for (Integer integer : resultList) {
            result[index++] = integer;
        }
        return result;
    }
}