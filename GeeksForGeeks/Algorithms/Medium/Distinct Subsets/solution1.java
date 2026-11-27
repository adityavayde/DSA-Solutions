class Solution {
    
    private void backtrack(int ind, int[] arr, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> ans) {
        
        if(ind == arr.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        
        current.add(arr[ind]);
        
        backtrack(ind + 1, arr, current, ans);
        
        current.remove(current.size() - 1);
        
        int next = ind + 1;

        while(next < arr.length && arr[next] == arr[ind]) {
            next++;
        }

        backtrack(next, arr, current, ans);
    }
    
    public ArrayList<ArrayList<Integer>> findSubsets(int[] arr) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        
        backtrack(0, arr, new ArrayList<>(), ans);
        
        return ans;
    }
}
