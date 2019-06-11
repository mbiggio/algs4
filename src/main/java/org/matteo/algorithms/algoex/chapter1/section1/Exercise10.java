package org.matteo.algorithms.algoex.chapter1.section1;

public class Exercise10 {

	public static void main(String[] args) {
		// int[] a;  // compile-time error: a not initialized
		int[] a = new int[10]; //ok
		for (int i = 0; i < 10; i++)
			a[i] = i * i;
	}
};
