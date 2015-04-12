package com.wyw.leetCode01_10;

public class LeetCode_08_StringToIntegerAtoi {
	public static void main(String[] args){

		String string = "2147483648";//1534236469;
		int result = atoi(string);
		System.out.println(result);
		
	}
	 
	public static int atoi(String str) {
		
		boolean flag = true;
		if(str == null || str.length() == 0){
			return 0;
		}
		int k = 0;
		while(k < str.length()){
			if(str.charAt(k) != ' '){
				break;
			}
			k++;
		}
		if(str.charAt(k) == '-'){
			flag = false;
			k++;
		}
		else if(str.charAt(k) == '+'){
			k++;
		}
		str = str.substring(k);
		str = str.substring(0, deleteNotValidate(str));
		char[] array = str.toCharArray();
		long result = 0;
		for(int i =0; i< array.length; i++){
			
			result = result * 10 + (array[i] - '0');
			
			if(result > Integer.MAX_VALUE){
				return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
		}
		return flag ? (int)result : (int)-result;
	}

	public static int deleteNotValidate(String str){
		int i = 0;
		for(; i < str.length(); i++){
			if(str.charAt(i) < '0' || str.charAt(i) > '9'){
				return i;
			}
		}
		return i;
	}
}
