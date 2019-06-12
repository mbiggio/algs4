package org.matteo.algorithms.algoex.chapter1.section3;
import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
 * Input: it was - the best - of times - - - it was - the - -
 * 
 *       |
 *       | it
 *       | it was
 * was   | it
 *       | it the
 *       | it the best
 * best  | it the
 *       | it the of
 *       | it the of times
 * times | it the of
 * of    | it the
 * the   | it
 *       | it was
 * was   | it
 *       | it the
 * the   | it
 * it    |
 * 
 */

public class Exercise2 {
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
