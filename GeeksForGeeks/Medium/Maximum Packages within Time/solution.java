class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        if (arr == null || arr.length == 0 || totalTime <= 0) {
            return 0;
        }
        int total = 0;
        if(totalTime > arr.length)
        {
            for(int i = 0 ; i < arr.length ; i++){
                total = total + arr[i];
            }
            return total;
        }
        int i = 0;
        int sum = 0;
        while(i < totalTime){
            sum += arr[i];
            i++;
        }
        int n = arr.length;
        int maxSum = sum;
        int k = totalTime;
        for(i = 1 ; i <= n-k ; i++){
            int prevElement = arr[i-1];
            int nextElement = arr[i+k-1];
        
            sum = sum - prevElement + nextElement;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}