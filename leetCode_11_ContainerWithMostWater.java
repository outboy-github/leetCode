package com.wyw.leetCode11_20;

public class LeetCode_11_ContainerWithMostWater {
	public static void main(String[] args){

		int[] height = {2,5,3,7,5,9,1};
		int water = maxArea(height);
		System.out.println(water);
		
	}
	public static int maxArea(int[] height) {
		int water = 0;
		int left = 0;
		int right = height.length - 1;
		while(left < right){
			int tmp = ((height[left] > height[right]) ? height[right] : height[left]) * (right - left);
			water = tmp > water ? tmp : water;
			if(height[left] < height[right]){
				++left;
			}
			else{
				--right;
			}
		}
		return water;
    }
}
