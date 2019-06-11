package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise29 {

	private static int helper(int key, int[] a, boolean equality) {
		int l = 0, u = a.length-1;
		int curIdx = -1;
		while (l <= u) {
			int m = l + (u - l) / 2;
			if (( equality && a[m] <= key) ||
					(!equality && a[m] <  key) ) {
				curIdx = Math.max(curIdx, m);
				l = m + 1;
			}
			else u = m - 1;
		}
		return curIdx;
	}

	public static int rank(int key, int[] a) {
		return helper(key, a, false) + 1;
	}

	public static int count(int key, int[] a) {
		return helper(key, a, true) - helper(key, a, false);
	}

	public static void printArray(int[] a) {
		for (int i=0; i<a.length; i++) StdOut.print(a[i] + " ");
		StdOut.println();
	}

	public static void main(String[] args) {
		In in = new In(args[0]);
		int[] whitelist = in.readInts(args[0]);
		String mode = args[1];
		Arrays.sort(whitelist);
		printArray(whitelist);
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			StdOut.printf("key: %d, rank: %d, count: %d\n",
					key, rank(key,whitelist), count(key,whitelist));
		}
	}
};
