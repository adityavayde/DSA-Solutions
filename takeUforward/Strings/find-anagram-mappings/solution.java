class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Deque<Integer>> indexMap = new HashMap<>();
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            indexMap.computeIfAbsent(nums2[i], k -> new ArrayDeque<>()).addLast(i);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = indexMap.get(nums1[i]).removeLast(); // Remove to avoid reuse
        }

        return result;
    }
}
