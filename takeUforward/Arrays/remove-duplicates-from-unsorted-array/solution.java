class Solution {
    public List<Integer> removeDuplicates(List<Integer> arr) {
        // Set to track seen elements
        Set<Integer> seen = new HashSet<>();

        // List to store unique elements
        List<Integer> result = new ArrayList<>();

        // Iterate through elements
        for (int num : arr) {
            // Add only if not already seen
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }

        // Return result
        return result;
    }
}