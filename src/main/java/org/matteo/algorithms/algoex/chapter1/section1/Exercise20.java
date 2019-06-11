package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise20 {

	public static double logFactorial(int N) {
		if (N <= 1) return 0;
		return Math.log(N) + logFactorial(N-1);
	}   

	public static void main(String[] args) {
		int N = StdIn.readInt();
		StdOut.println(logFactorial(N));
	}
};