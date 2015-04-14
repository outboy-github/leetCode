package com.wyw.leetCode11_20;

public class LeetCode_14_LongestCommonPrefix {
	public static void main(String[] args){

		String[] strs = {"abc","ab","sdd","dfs","s","fas"};
		String result = longestCommonPrefix(strs);
		System.out.println(result);
		
	}
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
        	return "";
        }
        String result = strs[0];
        for(int i = 1; i < strs.length; i++){
        	int length = result.length() < strs[i].length() ? result.length() : strs[i].length();
        	int k = 0;
        	while(k < length){
        		if(result.charAt(k) != strs[i].charAt(k)){
        			break;
        		}
        		k++;
        	}
        	result = result.substring(0, k);
        }
        return result;
    }
}
