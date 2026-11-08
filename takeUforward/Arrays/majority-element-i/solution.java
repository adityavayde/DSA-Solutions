class Solution {
    // Function to find the majority element in an array
    public int majorityElement(int[] nums) {
        // Size of the given array
        int n = nums.length;
        
        // Count
        int cnt = 0;
        
        // Element
        int el = 0;
        
        // Applying the algorithm
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        
        /* Checking if the stored element
         is the majority element*/
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }
        
        // Return element if it is a majority element
        if (cnt1 > (n / 2)) {
            return el;
        }
        
        // Return -1 if no such element found
        return -1;
    }
}