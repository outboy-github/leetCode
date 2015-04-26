package com.wyw.leetCode011_020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_18_4Sum {
	public static void main(String[] args){

		int[] num = {-3,-2,-1,0,0,1,2,3};
		int target = 0;
		List<List<Integer>> result = fourSum(num, target);
		System.out.println(result);
		
	}
	 
	 public static List<List<Integer>> fourSum(int[] num, int target) {
	     
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
		 
		 Arrays.sort(num);
		 for(int i = 0; i < num.length; i++ ){
			 int tmpTarget1 = target - num[i];
			 for(int j = i + 1; j < num.length; j++){
				 int tmpTarget2 = tmpTarget1 - num[j];
				 int p = j + 1;
				 int q = num.length - 1;
				 while(p < q){
					 List<Integer> list = new ArrayList<Integer>();
					 if(num[p] + num[q] == tmpTarget2){
						 list.add(num[i]);
						 list.add(num[j]);
						 list.add(num[p]);
						 list.add(num[q]);
						 result.add(list);
						 p++;
						 q--;
						 while(p < q && num[p] == num[p-1]){
							 p++;
						 }
						 while(q > p && num[q] == num[q+1]){
							 q--;
						 }
					 }
					 else if(num[p] + num[q] < tmpTarget2){
						 p++;						 
					 }
					 else{
						 q--;
					 }
				 }
				 while(j + 1 < num.length && num[j] == num[j+1]){
					 j++;
				 }
			 }
			 while(i + 1 < num.length && num[i] == num[i + 1]){
				 i++;
			 }
		 }
		 return result;
	 }
}
