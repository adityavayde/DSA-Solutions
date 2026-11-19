class Solution {
    public void sortIt(int[] arr) {
        // code here
        int n = arr.length ;
        int left = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            if( arr[i] % 2 != 0 ){
                int temp = arr[i] ;
                arr[i] = arr[left] ;
                arr[left] = temp ;
                left++;
            }
        }
        Arrays.sort(arr , 0 , left);
        int i = 0 ,j = left-1;
        while( i < j ){
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++;
            j--;

        }
        Arrays.sort( arr , left, n ) ;


    }
}