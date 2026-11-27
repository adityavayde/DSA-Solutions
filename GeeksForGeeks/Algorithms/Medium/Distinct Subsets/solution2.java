class Solution {
    
    private void func(int ind, List<Integer> arr, int[] nums, ArrayList<ArrayList<Integer>> ans) {
        // If index reaches the end of nums
        if (ind == nums.length) {
            // Add the current subset (arr) to the result
            ans.add(new ArrayList<>(arr));
            return;
        }

        // Include the current element in the subset
        arr.add(nums[ind]);
        // Recur for the next index
        func(ind + 1, arr, nums, ans);
        // Backtrack: remove the current element from the subset
        arr.remove(arr.size() - 1);

        // Skip duplicates and recur for the next unique element
        for (int j = ind + 1; j < nums.length; j++) {
            if (nums[j] != nums[ind]) {
                func(j, arr, nums, ans);
                return;
            }
        }

        // Ensure the function finishes when no more unique elements are left
        func(nums.length, arr, nums, ans);
    }
    
    public ArrayList<ArrayList<Integer>> findSubsets(int[] nums) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        Arrays.sort(nums);
        
        func(0, arr, nums, ans);
        
        return ans;
    }
}
