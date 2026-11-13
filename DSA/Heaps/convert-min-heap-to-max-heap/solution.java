class Solution {

    private void heapifyDown(int[] arr, int ind) {
        int n = arr.length;

        int largestInd = ind;

        int leftChildInd = 2*ind + 1;
        int rightChildInd = 2*ind + 2;

        if(leftChildInd < n && arr[leftChildInd] > arr[largestInd]) {
            largestInd = leftChildInd;
        }

        if(rightChildInd < n && arr[rightChildInd] > arr[largestInd]) {
            largestInd = rightChildInd;
        }

        if(largestInd != ind) {
            int temp = arr[largestInd];
            arr[largestInd] = arr[ind];
            arr[ind] = temp;

            heapifyDown(arr, largestInd);
        }
    }

    public int[] minToMaxHeap(int[] nums) {
        int n = nums.length;

        for(int i = n/2 - 1; i >= 0; i--) {
            heapifyDown(nums, i);
        }
        return nums;
    }
}