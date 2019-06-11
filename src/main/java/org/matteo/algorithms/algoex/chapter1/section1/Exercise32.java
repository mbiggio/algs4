package org.matteo.algorithms.algoex.chapter1.section1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdDraw;

public class Exercise32 {

	public static void drawHistogram(int[] occ, double l, double r) {
		StdDraw.clear();
		StdDraw.setPenRadius(0.004);
		StdDraw.setXscale(l,r);
		StdDraw.setYscale(-0.5,2.0);

		double step = (r-l)/(double)(occ.length);
		int N = 0;
		for (int i = 0; i < occ.length; i++) N += occ[i];
		for (int i = 0; i < occ.length; i++) {
			double x = l + i*step + step/2.0;
			double y = occ[i]/((double)N)/2.0;
			double rw = step/2.0;
			double rh = y;
			StdDraw.filledRectangle(x,y,rw,rh);
		}   
	}   

	public static void updateArray(int[] occ, double l, double r, double x) {
		if (x < l || x >= r) return;
		double step = (r-l)/(double)(occ.length);
		int index = (int)Math.floor((x-l)/step);
		occ[index]++;
	}

	public static void main(String[] args) {
		int[] occ = new int[20];
		double l = 0.0, r = 5.0;
		while (!StdIn.isEmpty()) {
			double x = StdIn.readDouble();
			updateArray(occ, l, r, x);
			drawHistogram(occ, l, r);
		}
	}
}
