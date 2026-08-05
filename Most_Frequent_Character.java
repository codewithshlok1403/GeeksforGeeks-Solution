class Solution {
	public static char getMaxOccuringChar(String s) {
		int maxFreq = 0;
		char ans = s.charAt(0);
		int i = 0;
		int j = 0;
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		int n = arr.length;
		while (j<n) {
			if (arr[i] == arr[j])
				j++;
			else {
				int freq = j - i;
				if (maxFreq<freq) {
					maxFreq = freq;
					ans = arr[i];
				}
				i = j;
			}
		}
		
		int freq = j - i;
		if (maxFreq<freq) {
			maxFreq = freq;
			ans = arr[i];
		}
		return ans;
	}
}
