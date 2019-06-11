package org.matteo.algorithms.algoex.chapter1.section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {
	public static void main(String[] args) {
		int N = StdIn.readInt();
		StdOut.println(lg(N));
	} 

	private static int lg(int N) {
		int M = 1, k = 0;
		while (M <= N) {
			M *= 2;
			k += 1;
		}
		return k-1;
	}   
};
