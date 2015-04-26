package com.wyw.leetCode011_020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * '{','}':123,125
 * '(',')':40,41
 * '[',']':91,93
 * @author wyw
 */
public class LeetCode_20_ValidParentheses {

	public static void main(String[] args) {

		String s = "(])";
		
		
		System.out.println(isValid(s));
		
	}
	public static boolean isValid(String s) {
		Deque<Character> queue = new ArrayDeque<Character>();
		/*if(!isJustContainingTheCharacters(s)){
			return false;
		}*/
		if(s == null || s.length() == 0){
			return false;
		}
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		for(char ch : s.toCharArray()){
			if(map.containsKey(ch)){
				queue.addLast(ch);
			}
			else{
				if(queue.isEmpty()){
					return false;
				}
				else{
					if(map.get(queue.getLast()) == ch){
						queue.pollLast();
					}
					else{
						return false;
					}
				}
			}
		}
		if(queue.isEmpty()){
			return true;
		}
		else{
			return false;
		}
    }
	public  static boolean isJustContainingTheCharacters(String s){
		if(s == null){
			return false;
		}
		Set<Character> set = new HashSet<Character>();
		set.add('(');
		set.add(')');
		set.add('{');
		set.add('}');
		set.add('[');
		set.add(']');
		for(char ch : s.toCharArray()){
			if(!set.contains(ch)){
				return false;
			}
		}
		
		return true;
	}
}
