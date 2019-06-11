package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

public class Exercise17 {
	public static void main(String[] args) {
		StdOut.println(exR2(6));
	}

	// WARN: stack overflow!
	public static String exR2(int n) {
		String s = exR2(n-3) + n + exR2(n-2) + n;
		if (n <= 0) return "";
		return s;
	}   
};  