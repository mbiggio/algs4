package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise30 {
	private static int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a%b);
	}


	public static boolean[][] haveCommonFactors(int N) {
		boolean[][] result = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (gcd(i,j) > 1) {
					result[i][j] = true;
				}
			}
		}
		return result;
	}

	public static void printArray(boolean[][] a) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				StdOut.printf("%5b ",a[i][j]);
			}
			StdOut.println();
		}
	}


	public static void main(String[] args) {
		while (!StdIn.isEmpty()) {
			int N = StdIn.readInt();
			boolean [][] result = haveCommonFactors(N);
			printArray(result);
		}
	}
}