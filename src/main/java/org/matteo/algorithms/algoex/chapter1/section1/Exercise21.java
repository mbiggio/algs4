package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise21 {

	public static void main(String[] args) { 
		while (!StdIn.isEmpty()) {
			String name = StdIn.readString();
			int a = StdIn.readInt();
			int b = StdIn.readInt();
			StdOut.printf("%10s %10d %10d %10d\n", name, a, b, a/b);
		}
	} 
};
