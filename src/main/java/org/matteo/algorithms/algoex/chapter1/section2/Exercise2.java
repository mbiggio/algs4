package org.matteo.algorithms.algoex.chapter1.section2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise2 {


	public static Interval1D[] readIntervals(int N) {
		Interval1D[] intervals = new Interval1D[N];
		for (int n = 0; n < N; n++) {
			double a = StdRandom.uniform(), b = StdRandom.uniform();
			intervals[n] = new Interval1D(Math.min(a,b), Math.max(a,b));
		}   
		return intervals;
	}

	// temporary (inefficient) solution: check all pairs for intersection
	// TODO: a better approach is to sort the left and right end-points 
	// and to use a line-sweep algorithm, keeping track of the currently
	// "open" rectangles.
	// in case of ties, end points should go before start points.
	public static void printIntersectingPairs(Interval1D[] intervals) {
		for (int i = 0; i < intervals.length; i++) {
			for (int j = i+1; j < intervals.length; j++) {
				if (intervals[i].intersects(intervals[j])) {
					StdOut.println(intervals[i] + " - " + intervals[j]);
				}
			}   
		}   
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		Interval1D[] intervals = readIntervals(N);
		printIntersectingPairs(intervals);
	}
}
