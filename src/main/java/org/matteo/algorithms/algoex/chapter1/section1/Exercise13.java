package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6}};
		printTranspose(array);
	} 

	private static void printTranspose(int[][] array) {
		for (int j=0; j<array[0].length; j++) {
			for (int i=0; i<array.length; i++) {
				StdOut.print(array[i][j] + " ");
			}
			StdOut.println();
		}
	}   
};
