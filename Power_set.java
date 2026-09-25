class Solution {
	public static void power(String str, ArrayList<String> ans, String current, int idx) {
		if (idx == str.length()) {
			if (!current.isEmpty()) {
				ans.add(current);
			}
			return;
			
		}
		char ch = str.charAt(idx);
		power(str, ans, current, idx + 1);
		power(str, ans, current + ch, idx + 1);
		
	}
	public ArrayList<String> powerSet(String s) {
		// code here
		ArrayList<String> ans = new ArrayList<>();
		power(s, ans, "", 0);
		return ans;
		
	}
}
