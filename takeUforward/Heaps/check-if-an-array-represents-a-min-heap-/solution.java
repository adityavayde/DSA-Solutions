class Solution {

    // Function to check if the given array is a min-heap
    public boolean isHeap(int[] nums) {
        int n = nums.length; // Size of the array
        
        // Iterate on the non-leaf nodes from the back
        for(int i = n/2 - 1; i >= 0; i--) {
            int leftChildInd = 2 * i + 1;
            int rightChildInd = 2 * i + 2;
            
            // If left child has a smaller value than the parent
            if(leftChildInd < n && nums[leftChildInd] < nums[i])
                return false;
                
            // If right child has a smaller value than parent
            if(rightChildInd < n && nums[rightChildInd] < nums[i])
                return false;
        }
        
        return true;
    }
}