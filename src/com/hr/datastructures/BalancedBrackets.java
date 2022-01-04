package com.hr.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				stack.push(c);
			} else if (!stack.empty() && map.get(stack.peek()) == c) {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {

		String s = "[{(])}]";
		System.out.println(isValid(s) ? "YES" : "NO");

	}
}
