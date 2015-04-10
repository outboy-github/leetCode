package com.wyw.leetCode01_10;

public class LeetCode_06_ZigZagConversion {
	public static void main(String[] args){

		String string = "Aad";
		int rows = 1;
		String result = convert(string, rows);
		System.out.println(result);
		
	}
	public static String convert(String s, int nRows){

		if(nRows == 1){
			return s;
		}
		StringBuffer convertString = new StringBuffer();
		int length = s.length();
		int i = 0;//控制行
		int j = 0;
		boolean flag = true;
		
		for(i = 0; i < nRows; i++ ){
			j = i;
			while(j < length){
				convertString.append(s.charAt(j));
				if(i == 0 || i == nRows - 1)
					j += 2 * (nRows - 1);
				else if(flag){
					j += 2 * (nRows - 1 - i);
					flag = false;
				}
				else{
					j += 2 * i;
					flag = true;
				}
			}
		}
		return convertString.toString();
	}
}
