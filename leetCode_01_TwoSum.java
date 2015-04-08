package com.wyw.leetCode01_10;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_01_TwoSum {
	public static void main(String[] args){

		int[] numbers = {0,4,3,0};
		int target = 0;
		int[] result = twoSum(numbers, target);
		System.out.println(result[0] + " " + result[1]);
	}
	
	 static int[] twoSum(int[] numbers, int target){
	    	int[] result = new int[2];
	    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	
	    	for(int i = 0; i < numbers.length; i++){
	    		if(map.containsKey(target - numbers[i])){
	    			result[0] = map.get(target - numbers[i]) + 1; 
	    			result[1] = i + 1;
	    		}
	    		else{
	    			map.put(numbers[i], i);
	    		}
	    	}
	    	return result;
	    }
}
