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

        backtrack(ind + 1, candidates, target - candidates[ind], current, ans);

        current.remove(current.size() - 1);

        for(int i = ind + 1; i < candidates.length; i++) {
            if(candidates[i] != candidates[ind]) {
                backtrack(i, candidates, target, current, ans);
                break;
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }
}