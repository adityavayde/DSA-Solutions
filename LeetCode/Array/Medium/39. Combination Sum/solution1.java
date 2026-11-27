class Solution {
    private void backtrack(int ind, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if(target < 0 || ind == candidates.length) {
            return;
        }

        current.add(candidates[ind]);

        backtrack(ind, candidates, target - candidates[ind], current, ans);

        current.remove(current.size() - 1);

        backtrack(ind + 1, candidates, target, current, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }
}