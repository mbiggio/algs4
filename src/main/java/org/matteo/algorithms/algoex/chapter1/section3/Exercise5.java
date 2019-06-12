package org.matteo.algorithms.algoex.chapter1.section3;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Exercise5 {
	
	public static void printBinary(int N) {
		Stack<Integer> stack = new Stack<>();
		while (N > 0) {
			stack.push(N % 2);
			N = N / 2;
		}
		for (int d : stack) StdOut.print(d);
		StdOut.println();
	}
	
	public static void main(String[] args) {
		printBinary(50);
	}
}
