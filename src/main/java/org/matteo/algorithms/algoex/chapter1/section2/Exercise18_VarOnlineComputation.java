package org.matteo.algorithms.algoex.chapter1.section2;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/*
 * Clever way to compute sample mean and variance online.
 * Using the definitions:
 * 
 * mu = sum_{k=1}^{n} x_{k} / N
 * var = sum_{k=1}^{n} (x_{k} - mu)^2 / (N-1)
 * 
 * it can be shown that the below update formulae work.
 * With respect to the naive way of storing the sum and the sum of squares,
 * this is supposed to give better numerical stability.
 */

public class Exercise18_VarOnlineComputation {
	
	private int n = 0;
	private double mu = 0.0;
	private double sum = 0.0;
	
	public static void main(String[] args) {		
		int N = StdIn.readInt();
		
		Bag<Double> bag = new Bag<>();
		Exercise18_VarOnlineComputation online = new Exercise18_VarOnlineComputation();
		for (int i = 0; i < N; i++) {
			double d = StdRandom.uniform();
			bag.add(d);
			StdOut.println("ensemble: " + computeVar(bag) + ", online: " + online.computeVar(d));
		}
	}

	private double computeVar(double d) {
		this.n++;
		double delta = d - this.mu;
		this.mu += delta / this.n;
		this.sum += (double) (this.n-1) / this.n * delta * delta;
		return sum/(this.n-1);
	}

	private static double computeVar(Bag<Double> bag) {
		double sum = 0.0;
		for (double x : bag) {
			sum += x;
		}
		double mean = sum / bag.size();
		
		sum = 0.0;
		for (double x : bag) {
			sum += (x - mean) * (x - mean);
		}
		double std = sum / (bag.size()-1);
		return std;
	}
}
