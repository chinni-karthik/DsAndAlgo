/*
In this post a different solution is discussed.
1) We can compare the first digit and the last digit, then we repeat the process.
2) For the first digit, we need the order of the number. Say, 12321. Dividing this by 10000 would get us the leading 1. The trailing 1 can be retrieved by taking the mod with 10.
3 ) Now, to reduce this to 232.

(12321 % 10000)/10 = (2321)/10 = 232 
4 ) And now, the 10000 would need to be reduced by a factor of 100.
*/

package com.ck.unable.solve;

//Java program to find number is palindrome or not without using any extra space
public class PalindromeOrNot {
	static boolean isPalindrome(int n) {
		// Find the appropriate divisor to extract the leading digit
		int divisor = 1;
		while (n / divisor >= 10)
			divisor *= 10;

		while (n != 0) {
			int leading = n / divisor;
			int trailing = n % 10;

			// If first and last digit not same return false
			if (leading != trailing)
				return false;

			// Removing the leading and trailing digit from number
			n = (n % divisor) / 10;

			// Reducing divisor by a factor of 2 as 2 digits are dropped
			divisor = divisor / 100;
		}
		return true;
	}

	// Driver code
	public static void main(String args[]) {
		if (isPalindrome(1001))
			System.out.println("Yes, it is Palindrome");
		else
			System.out.println("No, not Palindrome");
	}
}