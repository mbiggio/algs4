package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise23 {

	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length-1,0);
	} 

	public static int rank(int key, int[] a, int lo, int hi, int depth) {
		StdOut.printf(" ".repeat(depth) +"lo: %d, hi:%d\n",lo,hi);
		if (lo > hi) return -1;
		int mid = lo + (hi-lo)/2;
		if      (key > a[mid]) return rank(key, a, mid+1, hi,depth+1);
		else if (key < a[mid]) return rank(key, a, lo, mid-1,depth+1);
		else                   return mid;
	}

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readInts(args[0]);
		String mode = args[1];
		Arrays.sort(whitelist);
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			int index = rank(key, whitelist);
			if ((index == -1 && mode.equals("+")) ||
					(index != -1 && mode.equals("-")))
				StdOut.println(key);
		}
	}
};
