package com.wyw.leetCode011_020;

import java.util.Arrays;

public class LeetCode_16_3SumClosest {
	public static void main(String[] args){

		int[] num = {1,2,4,8,16,32,64,128};
		int target = 82;
		int result = threeSumClosest(num, target);
		System.out.println(result);
		
	}
	 public static int threeSumClosest(int[] num, int target) {
		 
		 if(num.length < 3){
			 System.out.println("input error.");
			 return -1;
		 }
		 Arrays.sort(num);
		 int length = num.length;
		 
		 int closest = Math.abs(target - num[0] - num[1] - num[2]);
		 int sum = num[0] + num[1] + num[2];
		 for(int i = 0; i < length; i++){
			 int tmp = target - num[i];
			 int p = i + 1;
			 int q = length - 1;
			 while(q > p){
				 int sumTmp = num[p] + num[q] + num[i];
					 
				 if(sumTmp < target){
					 p++;
					 if(Math.abs(target - sumTmp) < closest){
						 sum = sumTmp;
						 closest = Math.abs(target - sumTmp);
					 }
				 }
				 else{
					 q--;
					 if(Math.abs(target - sumTmp) < closest){
						 sum = sumTmp;
						 closest = Math.abs(target - sumTmp);
					 }
				 }
			 }
			 p++;
		 }
		 return sum;
	 }
}
