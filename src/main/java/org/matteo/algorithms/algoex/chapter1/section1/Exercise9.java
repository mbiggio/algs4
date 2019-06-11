package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {
	public static void main(String[] args) {
		int N = StdIn.readInt(); 
		StdOut.println(toBinaryString(N));
	} 

	private static String toBinaryString(int N) {
		if (N == 0) return "0";
		StringBuilder result = new StringBuilder();
		helper(N, result);
		return result.toString();
	}

	private static void helper(int N, StringBuilder result) {
		if (N == 0) return;
		helper(N/2, result);
		result.append(N%2);
	}
};
