class Solution {
    private void backtrack(int ind, int sum, int[] arr, ArrayList<Integer> ans) {
        if(ind == arr.length) {
            ans.add(sum);
            return;
        }
        
        backtrack(ind + 1, sum + arr[ind], arr, ans);
        
        backtrack(ind + 1, sum, arr, ans);
    }
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        backtrack(0, 0, arr, ans);
        
        return ans;
    }
}