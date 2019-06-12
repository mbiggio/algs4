package org.matteo.algorithms.algoex.chapter1.section3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdOut;

public class Exercise4 {

	public static boolean isValid(String expression) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '}') {
				if (stack.empty() || stack.pop() != '{') return false;
			}
			else if (expression.charAt(i) == ']') {
				if (stack.empty() || stack.pop() != '[') return false;
			}
			else if (expression.charAt(i) == ')') {
				if (stack.empty() || stack.pop() != '(') return false;
			}
			else {
				stack.push(expression.charAt(i));
			}		
		}
		return stack.empty();
	}
	
	public static void main(String[] args) {
		StdOut.println(isValid("[()]{}{[()()]()}"));
		StdOut.println(isValid("[(])"));
		StdOut.println(isValid("["));
	}
	
}
