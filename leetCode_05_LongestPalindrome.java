package com.wyw.leetCode01_10;


public class LeetCode_05_LongestPalindrome {
	public static void main(String[] args){

		String string = "cccs";
		String result = longestPalindrome(string);
		System.out.println(result);
		
	}
	public static String longestPalindrome(String s){

		String subString = "";
		String subString1 = "";
		String subString2 = "";
		for(int i =0; i < s.length(); i++){
			//if it is even
			subString1 = getPalindrome(s, i, i + 1);
			subString = subString.length() > subString1.length() ? subString : subString1;
			//if it is odd
			subString2 = getPalindrome(s, i, i);
			subString = subString.length() > subString2.length() ? subString : subString2;
		}
		return subString;
	}
	public static String getPalindrome(String s, int l1, int l2){
	
		String subString = "";
		while(l1 >= 0 && l2 < s.length()){
			if(s.charAt(l1) == s.charAt(l2)){
				--l1;
				++l2;
			}
			else{
				break;
			}
		}
		subString = (l2 - l1 + 1) > subString.length() ? s.substring(++l1, l2) : subString;
		return subString;
	}
		
}
