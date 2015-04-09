package com.wyw.leetCode01_10;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_03_LengthOfLongestSubstring {
	public static void main(String[] args){

		String string = "bcbabcd";
		int length = lengthOfLongestSubstring(string);
		System.out.println(length);
		
	}
	public static int lengthOfLongestSubstring(String string){
	
		Map<Character, Boolean> map = new HashMap<Character, Boolean>();
		int i = 0;
		int j = 0;
		int max_length = 0;
		int length = string.length();
		
		while(j < length){
			if(map.containsKey(string.charAt(j))){
				max_length = (j - i) > max_length ? (j - i) : max_length;
				while(string.charAt(i) != string.charAt(j)){
					map.remove(string.charAt(i));
					i++;
				}
				i++;
				j++;
			}
			else{
				map.put(string.charAt(j), true);
				j++;
			}
		}
		max_length = (length - i) > max_length ? (length - i) : max_length; 
		return max_length;
	}
}
