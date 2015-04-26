package com.wyw.leetCode011_020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LeetCode_15_ThreeSum {
	public static void main(String[] args){

		int[] num = new int[]{ -7, -1, -13, 2, 13, 2, 12, 3, -11, 3, 7, -15, 2, -9,
                -13, -13, 11, -10, 5, -13, 2, -12, 0, -8, 8, -1, 4, 10, -13, -5, -6, -4, 9, -12, 5, 8, 5, 3, -4, 9, 13,
                10, 10, -8, -14, 4, -6, 5, 10, -15, -1, -3, 10, -15, -4, 3, -1, -15, -10, -6, -13, -9, 5, 11, -6, -13,
                -4, 14, -3, 8, 1, -4, -5, -12, 3, -11, 7, 13, 9, 2, 13, -7, 6, 0, -15, -13, -11, -8, 9, -14, 1, 11, -7,
                13, 0, -6, -15, 11, -6, -2, 4, 2, 9, -15, 5, -11, -11, -11, -13, 5, 7, 7, 5, -10, -7, 6, -7, -11, 13,
                9, -10, -9  };
		List<List<Integer>> result = threeSum(num);
		System.out.println(result);
		
	}
	public static List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(num == null || num.length < 3){
			return result;
		}
		
		Arrays.sort(num);
		
		int length = num.length;
		for(int i = 0; i < length; i++){
			
			if(i != 0 && num[i] == num[i - 1]){
				continue;
			}
			
			int target = -num[i];
			int p = i + 1;
			int q = length - 1;
			while(p < q){
				if(num[p] + num[q] == target){
					List<Integer> tmp = new ArrayList<Integer>();
					tmp.add(-target);
					tmp.add(num[p]);
					tmp.add(num[q]);
					result.add(tmp);
					p++;
					q--;
					while(p < q && num[p] == num[p - 1]){
						p++;
					}
					while(q > p && num[q] == num[q + 1]){
						q--;
					}
				}
				else if(num[p] + num[q] < target){
					p++;
				}
				else{
					q--;
				}
			}
		}
		return result;
    }
}
