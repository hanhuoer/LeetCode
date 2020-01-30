class Solution {
    /**
     * hashmap
     */
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(i);
            if (null != hashMap.get(groupSizes[i])) {
                arrayList.addAll(hashMap.get(groupSizes[i]));
            }
            hashMap.put(groupSizes[i], arrayList);
            if (hashMap.get(groupSizes[i]).size() >= groupSizes[i]) {
                result.add(hashMap.get(groupSizes[i]));
                hashMap.remove(groupSizes[i]);
            }
        }
        return result;
    }
}