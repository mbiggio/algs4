package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {

	public static long F1(int N) {
		long a = 0, b = 1;
		for (int i=0; i<N; i++) {
			long tmp = a;
			a = b;
			b = tmp + b;
		}
		return a;
	}

	public static long F2(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F2(N-1) + F2(N-2);
	}

	public static void main(String[] args) {
		for (int N = 0; N < 100; N++)
			StdOut.println(N + " " + F1(N));
	}
};
