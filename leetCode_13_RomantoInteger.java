package com.wyw.leetCode11_20;

public class LeetCode_13_RomantoInteger {
	public static void main(String[] args){

		String s = "MCMXCVI";
		int result = romanToInt(s);
		System.out.println(result);
	}
	
	 public static int romanToInt(String s){
		 if(s == null || s.length() == 0){
			 return 0;
		 }
		 char[] romanNums = s.toCharArray();
		 int result = toNum(romanNums[0]);
		 for(int i = 1; i < romanNums.length; i++){
			 if(toNum(romanNums[i - 1]) < toNum(romanNums[i])){
				 result += toNum(romanNums[i]) - 2 * toNum(romanNums[i - 1]);
			 }
			 else{
				 result += toNum(romanNums[i]);
			 }
		 }
		 return result;
	 }
	 static int toNum(char roman){
		 switch (roman) {
		 
		 case 'I': return 1;
		 case 'V': return 5;
		 case 'X': return 10;
		 case 'L': return 50;
		 case 'C': return 100;
		 case 'D': return 500;
		 case 'M': return 1000;
		}
		 return 0;
	 }
}
