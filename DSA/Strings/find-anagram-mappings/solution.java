class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        boolean[] used = new boolean[nums2.length]; // Track used indices

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !used[j]) {
                    result[i] = j;
                    used[j] = true; // Mark as used
                    break;
                }
            }
        }

        return result;
    }
}
