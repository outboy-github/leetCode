package com.wyw.leetCode011_020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_17_LetterCombinationsOfAPhoneNumber {
	public static void main(String[] args){

		
		String digits = "23";
		List<String> result = letterCombinations(digits);
		System.out.println(result);
		
	}
	 
	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if(digits == null || digits.length() == 0 || !isValidate(digits)){
			return result;
		}
		
		Map<Character, String> map = new HashMap<Character, String>(); 
		map.put('0', "");
		map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        char[] tmpStr = new char[digits.length()];
        
        getLetterCombinations(result, digits, tmpStr, map, 0);
        return result;
        
     }
	public static void getLetterCombinations(List<String> result, String digits, char[] tmpStr,Map<Character, String> map, int index){

		if(index == digits.length()){
			result .add(String.valueOf(tmpStr));
			return;
		}
		for(int j = 0; j < map.get(digits.charAt(index)).length(); j++){
			tmpStr[index] = map.get(digits.charAt(index)).charAt(j);
			getLetterCombinations(result, digits, tmpStr, map, index + 1);
		}
	}
		
   	public static boolean isValidate(String digits){
		
		for(char ch : digits.toCharArray()){
			if(!Character.isDigit(ch)){
				return false;
			}
		}
		return true;
		
	}
}
