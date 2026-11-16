class Solution {
    public int findKthSmall(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int sequenceNum = 0;
        int n = 0;

        while(k > n){
            sequenceNum++;
            if(!set.contains(sequenceNum)){
                n++;
            }
        }

        return sequenceNum;

    }
}