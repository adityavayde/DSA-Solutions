class Solution {
	public boolean checkWithinK(int[] arr, int k) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0; i <= k; i++)
		
			if (!set.add(arr[i]))
				return true;
		
		for (int i = k + 1; i<arr.length; i++) {
			set.remove(arr[i - k-1]);
			
			if (!set.add(arr[i]))
				return true;
		}
		
		return false;
	}
}
