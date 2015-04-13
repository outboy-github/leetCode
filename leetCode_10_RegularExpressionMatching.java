package com.wyw.leetCode01_10;

public class LeetCode_10_RegularExpressionMatching {

	public static void main(String[] args) {

		String s = null;
		String p = ".*..a";
		
		System.out.println(isMatch(s, p));
	}
	
	 public static boolean isMatch(String s, String p) {
	 
		 if(s == null){
			 return p == null;
		 }
		 if(p == null){
			 return s == null;
		 }
		 if(p.length() == 0){
			 return s.length() == 0;
		 }
		 if(p.length() == 1){
			 return (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.') && s.length() == 1;
		 }
		 if(p.charAt(1) != '*'){
			 if(s.length() == 0){
				 return false;
			 }
			 else{
				 return (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1));
			 }
		 }
		 else{
			 while(s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')){
				 if(isMatch(s, p.substring(2))){
					 return true;
				 }
				 s = s.substring(1);
			 }
			 return isMatch(s, p.substring(2));
		 }
	}
}
