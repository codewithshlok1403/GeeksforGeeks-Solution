class Solution {
	public int reverseExponentiation(int n) {
		int num = n;
		int rev = 0;
		int rem = 0;
		while (num != 0) {
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		return pow(n, rev);
	}
	public static int pow(int n, int power) {
		if (power == 0)return 1;
		return n*pow(n, power - 1);
	}
	
}
