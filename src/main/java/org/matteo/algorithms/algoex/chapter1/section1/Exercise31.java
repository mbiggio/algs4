package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise31 {

	public static void drawRandomChords(int N, double p) {
		double angle = 2.0*Math.PI/(double)N;
		StdDraw.setPenRadius(0.004);
		StdDraw.setXscale(-2.0,2.0);
		StdDraw.setYscale(-2.0,2.0);
		for (int i = 0; i < N; i++) {
			StdDraw.point(Math.cos(angle*i), Math.sin(angle*i));
		}

		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if (StdRandom.bernoulli(p)) {
					StdDraw.line(
							Math.cos(angle*i), Math.sin(angle*i),
							Math.cos(angle*j), Math.sin(angle*j));
				}
			} 
		}
	}

	public static void main(String[] args) {
		drawRandomChords(100, 0.02);
	}
}
