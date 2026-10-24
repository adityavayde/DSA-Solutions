class Solution {
    public static int beauty(int arr[]){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            if(arr[i] != 0){
                min = Math.min(min,arr[i]);
            }
        }
        return max-min;
    }
    public static int beautySum(String s) {
        // code here
        int count =0;
        for(int i=0;i<s.length();i++){
            int arr[] = new int[26];
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j)-'a']++;
                count += beauty(arr);
            }
        }
        return count;
    }
}