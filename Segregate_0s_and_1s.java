class Solution {
	void segregate0and1(int[] arr) {
		
		int i = 0;
		int j = arr.length - 1;
		
		while (i < j) {
			
			if (arr[i] == 0) {
				i++;
			}
			else if (arr[j] == 1) {
				j--;
			}
			else {
				arr[i] = 0;
				arr[j] = 1;
				i++;
				j--;
			}
		}
	}
}
