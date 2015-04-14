package com.wyw.leetCode11_20;

public class LeetCode_12_IntegertoRoman {
	public static void main(String[] args){

		int num = 1996;
		String result = intToRoman(1996);
		System.out.println(result);
	}
	
	public static String intToRoman(int num){
		 String[][] roman = {  
		            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
		            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
		            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
		            {"", "M", "MM", "MMM"}  
		        };  
		 String result = "";
		 int digit = 0;
		 while(num != 0){
			 int tmp = num % 10;
			 result = roman[digit][tmp] + result;
			 num /= 10;
			 ++digit;
		 }
		 return result;
	 }
}
