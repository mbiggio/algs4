package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise7 {
	public static void main(String[] args) {
		int N = StdIn.readInt();
		func1();
		func2();
		func3(N);
	}

	// Newton's method to compute sqrt(9.0)
	private static void func1() {
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001*t)
			t = (9.0/t + t) / 2.0;
		StdOut.printf("%.5f\n", t);
	}

	// sum_{i=1}^{999} i = 1000*999/2 = 499500
	private static void func2() {
		int sum = 0;
		for (int i=1; i<1000; i++) {
			for (int j=0; j<i; j++) {
				sum++;
			}
		}
		StdOut.println(sum);
	}
	
	// sum_{k=0}^{2**k < 1000} N = sum_{k=0}^{k<10} N = 10*N
	private static void func3(int N) {
		int sum = 0;
		for (int i=1; i<1000; i*=2) {
			for (int j=0; j<N; j++) {
				sum++;
			}
		}
		StdOut.println(sum);
	}
};
