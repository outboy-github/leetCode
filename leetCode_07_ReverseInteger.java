package com.wyw.leetCode01_10;

public class LeetCode_07_ReverseInteger {
	public static void main(String[] args){

		int num = -2147483648;//1534236469;
		int result = reverse(num);
		System.out.println(result);
		
	}
	 
	public static int reverse(int x){
		 int flag = x > 0 ? 1 : -1;
		 
		 long result = 0;
		 long tmp = x * flag;
		 while(tmp != 0){
			 result = (result * 10) + (tmp % 10);
			 tmp /= 10;
		 }
		 result = flag > 0 ? result : -result;
		 if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
			 return 0;
		 }
		 return (int)result;
		 
	 }
}
