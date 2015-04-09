package com.wyw.leetCode01_10;

import java.util.Arrays;

public class LeetCode_04_FindMedianSortedArrays {
	public static void main(String[] args){

		int[] arr1 = {};
		int[] arr2 = {2,3};
		double num = findMedianSortedArrays(arr1, arr2);
		System.out.println(num);
		
	}
	public static double findMedianSortedArrays(int[] A, int[] B){

		int[] array = new int[A.length + B.length];
		System.arraycopy(A, 0, array, 0, A.length);
		System.arraycopy(B, 0, array, A.length, B.length);
		
		Arrays.sort(array);
		int length = array.length;
		if((length & 1) == 1){
			return array[length / 2] / 1.0;
		}
		else{
			return (array[length / 2 - 1] + array[length / 2]) / 2.0;
		}
	
	}
}
