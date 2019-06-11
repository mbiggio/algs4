package org.matteo.algorithms.algoex.chapter1.section2;

import edu.princeton.cs.algs4.ClosestPair;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise1 {
	
	public static void main(String[] args) {
		int n = StdIn.readInt();
		Point2D[] points = generateRandomPoints(n);
		ClosestPair closestPair = new ClosestPair(points);
		StdOut.println("closest points: " + closestPair.either() + ", " + closestPair.other());
		StdOut.println("distance: " + closestPair.distance());
	}

	private static Point2D[] generateRandomPoints(int n) {
		Point2D[] points = new Point2D[n];
		for (int i = 0; i < n; i++) {
			points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
		}
		return points;
	}
}
