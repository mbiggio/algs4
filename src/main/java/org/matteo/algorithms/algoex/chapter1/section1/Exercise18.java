package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise18 {

	public static void main(String[] args) {
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		StdOut.println("a*b = " + mystery(a,b) + ", a**b = " + mystery2(a,b));
	} 

	// computes a*b
	public static int mystery(int a, int b) {
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery(a+a,b/2);
		return mystery(a+a,b/2) + a;
	}

	// computes a**b
	public static int mystery2(int a, int b) {
		if (b == 0) return 1;
		if (b % 2 == 0) return mystery2(a*a,b/2);
		return mystery2(a*a,b/2) * a;
	}
}
