package com.wyw.leetcode.leetcode01_10;

public class LeetCode_09_PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(11221));
	}

	public static boolean isPalindrome(int x) {
		
		if(x < 0){
			return false;
		}
		int sign = 1;
		while(x / sign > 9){
			sign *= 10;
		}
		while(x != 0){
			if(x / sign != x % 10){
				return false;
			}
			else{
				x = x - (x / sign) * sign;
				x /= 10;
				sign /= 100;
			}
		}
		return true;
	}
}
