package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

public class Exercise15 {
	public static void main(String[] args) {
		int[] array = {1,2,3,1,2,4,3,5};
		int[] h = histogram(array,10);
		for (int i=0; i<h.length; i++) {
			StdOut.print(h[i] + " ");
		}
		StdOut.println();
	}   

	public static int[] histogram(int[] array, int M) {
		int[] h = new int[M];
		for (int value : array) {
			if (value >= 0 && value < M) h[value]++;
		}
		return h;
	}
};
