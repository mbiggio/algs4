package org.matteo.algorithms.algoex.chapter1.section3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
 * a) 0 1 2 3 4 - - - - - 5 6 7 8 9 - - - - -
 * b) 0 1 2 3 4 - 5 6 - 7 8 - - - - - 9 - - - 
 * c) 0 1 2 - 3 4 5 - 6 - 7 - - 8 - 9 - - - -
 * d) 0 1 2 3 4 - - - - - 5 - 6 - 7 - 8 - 9 -    
 * e) 0 1 - 2 - 3 - 4 - 5 - 6 - 7 8 9 - - - - 
 * f) impossible - 1 cannot come after 8
 * g) impossible - 0 cannot come after 3
 * h) 0 1 2 - - 3 4 - - 5 6 - - 7 8 - - 9 - - 
 */

public class Exercise3 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		while(!StdIn.isEmpty()) {
			String string = StdIn.readString();
			if (string.equals("-")) {
				StdOut.println(stack.pop());
			}
			else stack.push(string);
		}
	}
}
