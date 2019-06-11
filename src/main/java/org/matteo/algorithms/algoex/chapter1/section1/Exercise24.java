package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise24 {

	public static int gcd(int a, int b, int depth) {
		StdOut.printf(" ".repeat(depth) + "a: %d, b: %d\n",a,b);
		if (b == 0) return a;
		return gcd(b,a%b,depth+1);
	} 

	public static void main(String[] args) { 
		int a = StdIn.readInt(), b = StdIn.readInt();
		StdOut.printf("gcd(%d,%d) = %d\n", a,b,gcd(a,b,0));
	} 
}   