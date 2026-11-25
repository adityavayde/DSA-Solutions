class Solution {
    
    private boolean backtrack(int ind, int sum, int[] arr) {
        if(sum == 0) {
            return true;
        }
        
        if(sum < 0 || ind == arr.length) return false;
        
        return backtrack(ind + 1, sum, arr) ||
               backtrack(ind + 1, sum - arr[ind], arr);
    }
    
    public boolean checkSubsequenceSum(int[] arr, int k) {
        return backtrack(0, k, arr);
    }
}