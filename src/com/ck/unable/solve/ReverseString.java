/*
1. Set the left index equal to 0 and right 
   index equal to the length of the string -1.
2. Swap the characters of the start index 
   scanning with the last index scanning 
   one by one. After that, increase the left 
   index by 1 (left++) and decrease the right 
   by 1 i.e., (right--) to move on to the next 
   characters in the character array .
3. Continue till left is less than or equal to
   the right.
*/

package com.ck.unable.solve;

//Class of ReverseString
public class ReverseString {
	public static void main(String[] args) {
		String input = "Geeks For Geeks";
		char[] temparray = input.toCharArray();
		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		for (char c : temparray)
			System.out.print(c);
		System.out.println();
	}
}