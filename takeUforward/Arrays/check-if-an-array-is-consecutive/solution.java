class Solution {
    public boolean isConsecutive(int[] nums) {
        int n = nums.length;
        int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) return false; // duplicate
            seen.add(num);
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }

        return mx - mn + 1 == n;
    }
}
