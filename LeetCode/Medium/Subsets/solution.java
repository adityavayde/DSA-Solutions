class Solution {

    private void backtrack(int ind, int n, int[] nums, List<Integer> current, List<List<Integer>> ans) {
        if(ind == n) {
            ans.add(new ArrayList<>(current));
            return;
        }

        backtrack(ind + 1, n, nums, current, ans);
        current.add(nums[ind]);

        backtrack(ind + 1, n, nums, current, ans);
        current.remove(current.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, nums.length, nums, current, ans);
        return ans;
    }
}